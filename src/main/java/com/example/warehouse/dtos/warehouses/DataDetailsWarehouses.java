package com.example.warehouse.dtos.warehouses;

import com.example.warehouse.dtos.address.DataAddress;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataDetailsWarehouses(
        @NotBlank
        String name,

        @NotNull
        @Valid
        DataAddress address
) {
}
