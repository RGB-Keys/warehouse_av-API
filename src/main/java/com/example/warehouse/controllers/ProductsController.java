package com.example.warehouse.controllers;

import com.example.warehouse.dtos.products.DataDetailsProducts;
import com.example.warehouse.dtos.products.DataRegisterProducts;
import com.example.warehouse.models.Product;
import com.example.warehouse.repositories.ProductRepository;
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
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity saveProduct(@RequestBody @Valid DataRegisterProducts data, UriComponentsBuilder uriBuilder){
       var product =  new Product(data);
       repository.save(product);

       var uri = uriBuilder.path("/products/{id}").buildAndExpand(product.getId()).toUri();
        return ResponseEntity.created(uri).body(new DataDetailsProducts(product));
    }
}
