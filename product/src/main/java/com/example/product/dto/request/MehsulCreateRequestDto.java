package com.example.product.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.validation.constraints.Min;

import java.time.LocalDate;

@Data
public class MehsulCreateRequestDto {
  @NotBlank
private String name;
  @NotNull
 @Min(value = 0, message = "Qiymət mənfi ola bilməz")
private Long costPrice;
    @NotNull
private LocalDate productionDate;
    @NotNull
private LocalDate lastUseDate;
    @NotBlank
private Long categoryId;
    @NotNull
    @Min(value = 0)
private Long sellingPrice;
}
