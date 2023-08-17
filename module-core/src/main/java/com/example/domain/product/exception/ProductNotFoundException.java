package com.example.domain.product.exception;

import com.example.common.exception.BusinessException;

public class ProductNotFoundException extends BusinessException {

    public ProductNotFoundException(Long id) {
        super("요청하신 상품(id :%d)을 찾을 수 없습니다.".formatted(id));
    }
}
