package com.example.infrastructure.persistence.product;

import com.example.domain.product.Product;
import com.example.domain.product.ProductQueryRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaQueryRepository
        extends JpaRepository<Product, Long>,
        ProductQueryRepository {
}
