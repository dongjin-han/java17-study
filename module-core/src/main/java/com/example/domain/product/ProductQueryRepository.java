package com.example.domain.product;

import java.util.Optional;

/**
 * output port 인터페이스에 정의된 메서드를 구현한 persistence adapter 정도에 해당되는 클래스이다.
 * 도메인과 엔티티를 구분하지 않는 프로젝트 특성 상
 * 도메인을 엔티티로 변환하지 않기에 별도로 adapter 및 port 를 두지 않았다.
 * JPA Query 를 위한 repository
 */
public interface ProductQueryRepository {

    Optional<Product> findById(Long id);
}
