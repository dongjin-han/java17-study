package com.example.application.product;

import com.example.application.product.command.ProductCreateCommand;
import com.example.domain.product.ProductRepository;
import com.example.domain.product.dto.ProductDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * usecase 인터페이스를 두고 service 클래스에서 그 usecase 를 구현하고
 * controller 에서 usecase 인터페이스를 활용하는 방법도 있지만 우리는 Command 와 Query 를 분리하기 위해
 * usecase 인터페이스 없이 CommandHandler / QueryService (+ facade) 로 나누었다.
 *
 * 그 중 CommandHandler 는 CRUD 중 CUD 를 담당하여 CQS(혹은 CQRS) 패턴의 C 를 담당한다.
 */
@Service
public class ProductCommandHandler {

    private final ProductRepository productRepository;

    public ProductCommandHandler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public ProductDto handle(ProductCreateCommand command) {
        return ProductDto.from(productRepository.save(command.create()));
    }

}
