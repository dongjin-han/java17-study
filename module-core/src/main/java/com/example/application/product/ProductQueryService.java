package com.example.application.product;

import com.example.domain.product.ProductQueryRepository;
import com.example.domain.product.dto.ProductDto;
import com.example.domain.product.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * application 의 inpu port 인 usecase 인터페이스를 두고 application 의 service 클래스에서 그 usecase 를 구현하고
 * controller 에서 usecase 인터페이스를 활용하는 방법도 있지만 우리는 Command 와 Query 를 분리하기 위해
 * usecase 인터페이스 없이 CommandHandler / QueryService (+ facade) 로 나누었다.
 *
 * 그 중 QueryService 는 CRUD 중 R 을 담당하여 CQS(혹은 CQRS) 패턴의 Q 를 담당한다.
 */
@Service
public class ProductQueryService {

    private final ProductQueryRepository productQueryRepository;

    public ProductQueryService(ProductQueryRepository productQueryRepository) {
        this.productQueryRepository = productQueryRepository;
    }

    @Transactional(readOnly = true)
    public ProductDto getProduct(Long id) {
        var product = productQueryRepository.findById(id).
                orElseThrow(() -> new ProductNotFoundException(id));

        return ProductDto.from(product);
    }
}
