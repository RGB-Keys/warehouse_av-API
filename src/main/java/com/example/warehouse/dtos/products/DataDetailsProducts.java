package com.example.warehouse.dtos.products;

import com.example.warehouse.models.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record DataDetailsProducts(
        String name,
        String description,
        BigDecimal value,
        Type type
) {
    public DataDetailsProducts(Product product) {
        this(product.getName(), product.getDescription(), product.getValue(), product.getType());
    }
}
