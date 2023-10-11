package com.example.warehouse.dtos.products;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record DataRegisterProducts(
        @NotBlank
        String name,

        String description,

        @NotNull
        @PositiveOrZero
        BigDecimal price,

        @NotNull
        Type type
) {
}
