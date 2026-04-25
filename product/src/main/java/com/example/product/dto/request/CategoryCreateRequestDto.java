package com.example.product.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoryCreateRequestDto {
    @NotBlank
    private String categoryName;

}
