package com.example.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class request {
    private String name;
    private Long price;
    private Long productionDate;
    private Long lastUseDate;
    private Long category;
    private Long sellingPrice;
}
