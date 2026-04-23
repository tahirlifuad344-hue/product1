package com.example.product.service;
import  com.example.product.dto.response;
public interface MehsulService {
    response findByIdAsDto(Long id);

    response create(response request);
}
