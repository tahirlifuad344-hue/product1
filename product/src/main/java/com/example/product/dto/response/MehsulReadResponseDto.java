package com.example.product.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MehsulReadResponseDto {
    private Long id;
    private String name;
    private Long costPrice;
    private LocalDate productionDate;
    private LocalDate  lastUseDate;
    private Long categoryId;
    private Long sellingPrice;
}
