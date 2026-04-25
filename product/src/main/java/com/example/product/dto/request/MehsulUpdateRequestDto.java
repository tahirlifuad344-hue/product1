package com.example.product.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class MehsulUpdateRequestDto {
@NotBlank
private String name;
@NotBlank
@Min(value = 0,message = "Qiymət mənfi ola bilməz")
private Long costPrice;
@NotBlank
private LocalDate productionDate;
@NotBlank
private LocalDate  lastUseDate;
@NotBlank
private Long categoryId;
@NotBlank
@Min(value = 0)
private Long sellingPrice;

}
