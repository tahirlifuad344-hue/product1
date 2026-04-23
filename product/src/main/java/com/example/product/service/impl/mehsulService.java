package com.example.product.service.impl;

import com.example.product.dto.request;
import com.example.product.dto.response;
import com.example.product.entity.category;
import com.example.product.entity.mehsul;
import com.example.product.repository.categoryRepository;
import com.example.product.repository.mehsulRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class mehsulService {

    private final mehsulRepository mehsulRepository;
    private final categoryRepository categoryRepository;

    public response create(request request) {

        // 1 — category-ni DB-dən tap
        category category = categoryRepository.findById(request.getCategory())
                .orElseThrow(() -> new RuntimeException("Category tapılmadı"));

        // 2 — request-dən entity yarat
        mehsul mehsul = new mehsul();
        mehsul.setName(request.getName());
        mehsul.setPrice(request.getPrice());
        mehsul.setProductionDate(request.getProductionDate());
        mehsul.setLastUseDate(request.getLastUseDate());
        mehsul.setCategory(category);
        mehsul.setSellingPrice(request.getSellingPrice());

        // 3 — DB-yə saxla
        mehsul saved = mehsulRepository.save(mehsul);

        // 4 — response qaytar
        return new response(
                saved.getId(),
                saved.getName(),
                saved.getPrice(),
                saved.getProductionDate(),
                saved.getLastUseDate(),
                saved.getCategory().getName(),
                saved.getSellingPrice()
        );
    }
}