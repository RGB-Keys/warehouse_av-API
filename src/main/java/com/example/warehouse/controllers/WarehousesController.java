package com.example.warehouse.controllers;

import com.example.warehouse.dtos.warehouses.DataDetailsWarehouses;
import com.example.warehouse.dtos.warehouses.DataRegisterWarehouses;
import com.example.warehouse.models.Warehouse;
import com.example.warehouse.repositories.WarehouseRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/warehouses")
public class WarehousesController {

    @Autowired
    private WarehouseRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity saveWarehouse(@RequestBody @Valid DataRegisterWarehouses data, UriComponentsBuilder uriBuilder) {

        var warehouse = new Warehouse(data);
        repository.save(warehouse);

        var uri = uriBuilder.path("/warehouses/{id}").buildAndExpand(warehouse.getId()).toUri();
        return ResponseEntity.created(uri).body(new DataDetailsWarehouses(warehouse));
    }
}
