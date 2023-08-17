package com.example.domain.product.dto;

import com.example.domain.product.Product;
import lombok.AccessLevel;
import lombok.Builder;

public record ProductDto(
        String productName,
        String productDescription
) {
    @Builder(access = AccessLevel.PROTECTED)
    public ProductDto(String productName,
                      String productDescription) {
        this.productName = productName;
        this.productDescription = productDescription;
    }

    public static ProductDto from(Product product) {
        return ProductDto.builder()
                .productName(product.getProductName())
                .productDescription(product.getProductDescription())
                .build();
    }
}
