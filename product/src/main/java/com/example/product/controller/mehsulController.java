package com.example.product.controller;

import com.example.product.dto.response;
import com.example.product.service.MehsulService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/mehsul")
@RequiredArgsConstructor
public class mehsulController {

    private final MehsulService mehsulService;
    @PostMapping
    public ResponseEntity<response> create(@RequestBody response request) {
        response created = mehsulService.create(request);
        return ResponseEntity.ok(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<response> getById(@PathVariable Long id) {
        response response = mehsulService.findByIdAsDto(id);
        return ResponseEntity.ok(response);
    }
}
