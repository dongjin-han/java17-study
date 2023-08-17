package org.example.infrastructure.web.product;

import com.example.application.product.ProductCommandHandler;
import com.example.application.product.ProductQueryService;
import com.example.domain.product.dto.ProductDto;
import jakarta.validation.Valid;
import org.example.infrastructure.web.product.dto.ProductCreateRequest;
import org.example.infrastructure.web.product.dto.ProductSearchRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * web input adapter 에 해당하는 controller 클래스
 * 그 중에서 CRUD 중 Read 에 해당하는 Query 요청을 처리하기 위한 controller
 */
@RestController
public class ProductQueryController {

    private final ProductQueryService productQueryService;

    public ProductQueryController(ProductQueryService productQueryService) {
        this.productQueryService = productQueryService;
    }

    @GetMapping("/v1/products/{id}")
    public ProductDto getProduct(@PathVariable Long id) {
        return productQueryService.getProduct(id);
    }

    @GetMapping("/v1/products")
    public List<ProductDto> getProducts(@Valid ProductSearchRequest productSearchRequest) {
        // 적절하게 구현
        return null;
    }
}
