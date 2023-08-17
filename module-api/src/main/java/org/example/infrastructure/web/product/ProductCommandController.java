package org.example.infrastructure.web.product;

import com.example.application.product.ProductCommandHandler;
import com.example.domain.product.dto.ProductDto;
import jakarta.validation.Valid;
import org.example.infrastructure.web.product.dto.ProductCreateRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * web input adapter 에 해당하는 controller 클래스
 * 그 중에서 CRUD 중 CUD 에 해당하는 Command 요청을 처리하기 위한 controller
 */
@RestController
public class ProductCommandController {

    private final ProductCommandHandler productCommandHandler;

    public ProductCommandController(ProductCommandHandler productCommandHandler) {
        this.productCommandHandler = productCommandHandler;
    }

    @PostMapping("/v1/products")
    public ProductDto createProduct(@Valid ProductCreateRequest productCreateRequest) {
        var command = productCreateRequest.toCommand();

        return productCommandHandler.handle(command);

    }
}
