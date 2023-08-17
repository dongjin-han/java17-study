package com.example.application.product.command;

import com.example.domain.product.Product;

/**
 * web adapter 로 받은 혹은 event adapter 등으로 받은 CUD 요청을
 * 어플리케이션 계층의 CommandHandler 에서 사용하기 위한 Command 객체
 */
public class ProductCreateCommand {

    String productName;
    String productDescription;
    String createBy;

    public ProductCreateCommand(String productName,
                                String productDescription,
                                String createBy) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.createBy = createBy;
    }

    /**
     * 어댑터로 들어온 CUD 요청을 Command 객체로 바꾸기 위한 정적 메소드
     *
     * @param productName
     * @param productDescription
     * @param createBy
     * @return
     */
    public static ProductCreateCommand of(String productName,
                                           String productDescription,
                                           String createBy) {
        return new ProductCreateCommand(productName, productDescription, createBy);
    }

    /**
     * Command 객체가 도메인 객체를 제어한다.
     * @return
     */
    public Product create() {
        return Product.create(productName, productDescription, createBy);

    }
}
