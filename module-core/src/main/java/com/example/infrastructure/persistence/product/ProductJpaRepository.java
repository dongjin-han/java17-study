package com.example.infrastructure.persistence.product;

import com.example.domain.product.Product;
import com.example.domain.product.ProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository
        extends JpaRepository<Product, Long>,
        ProductRepository {
}
