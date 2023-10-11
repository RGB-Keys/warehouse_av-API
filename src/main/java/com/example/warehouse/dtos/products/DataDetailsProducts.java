package com.example.warehouse.dtos.products;

import com.example.warehouse.models.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record DataDetailsProducts(
        Long id,
        String name,
        String description,
        BigDecimal price,
        Type type
) {
    public DataDetailsProducts(Product product) {
        this(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getType());
    }
}
