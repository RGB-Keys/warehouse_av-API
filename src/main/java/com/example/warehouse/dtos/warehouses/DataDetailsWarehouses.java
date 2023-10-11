package com.example.warehouse.dtos.warehouses;

import com.example.warehouse.dtos.address.DataAddress;
import com.example.warehouse.models.Address;
import com.example.warehouse.models.Warehouse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataDetailsWarehouses(
        Long id,
        String name
        //Address address
) {
    public DataDetailsWarehouses(Warehouse warehouse) {
        this(warehouse.getId(), warehouse.getName());
    }
}
