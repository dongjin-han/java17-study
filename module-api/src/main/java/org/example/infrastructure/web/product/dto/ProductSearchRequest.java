package org.example.infrastructure.web.product.dto;

import com.example.application.product.command.ProductCreateCommand;
import jakarta.validation.constraints.NotNull;

public record ProductSearchRequest(
        @NotNull(message = "상품명은 필수입니다.")
        String productName,
        String productDescription,
        @NotNull(message = "등록자명은 필수입니다.")
        String createBy
) {
        public ProductCreateCommand toCommand() {
                return ProductCreateCommand.of(productName, productDescription, createBy);
        }
}
