package com.example.domain.product;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.springframework.util.Assert;

import java.time.LocalDateTime;

/**
 * 도메인이자 엔티티의 역할을 하는 클래스.
 * 도메인의 특징은 특정 기술에 종속적이지 않은 순수 JAVA 즉, Plain Old Java Object (POJO) 이다.
 * 클린 아키텍처, 헥사고날 아키텍처 등에서는 도메인과 엔티티를 분리하는 케이스가 많은데,
 * 분리하면 다시 도메인을 엔티티로 변환하기 위한 코드 작업이 많아지고 그 변환로직으로 인해 가독성이 떨어져서 하나로 합치게 되었다.
 * 도메인과 엔티티를 분리하면 DB 영속화가 엔티티에서만 이루어지기에 계층간 분리가 잘되는 장점도 있다.
 */
@Getter
@Table(name = "product")
public class Product {

    @Id
    Long id;

    @Column(name = "product_name", nullable = false)
    String productName;

    @Column(name = "product_description")
    String productDescription;

    @Column(name = "create_by", nullable = false)
    String createBy;

    @Column(name = "create_at", nullable = false)
    LocalDateTime createAt;


    /**
     * 새로운 상품을 만든다.
     *
     * @param productName
     * @param productDescription
     * @param createBy
     * @return
     */
    public static Product create(String productName,
                                 String productDescription,
                                 String createBy) {
        Assert.notNull(productName, "상품명은 필수 정보입니다.");
        Assert.notNull(createBy, "등록자명은 필수 정보입니다.");

        var product = new Product();

        product.productName = productName;
        product.productDescription = productDescription;
        product.createBy = createBy;
        product.createAt = LocalDateTime.now();

        return product;
    }
}
