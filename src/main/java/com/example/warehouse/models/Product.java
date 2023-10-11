package com.example.warehouse.models;

import com.example.warehouse.dtos.products.DataRegisterProducts;
import com.example.warehouse.dtos.products.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "product")
@Entity(name = "Product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String description;

    private BigDecimal value;

    @Enumerated(EnumType.STRING)
    private Type type;

    public Product(DataRegisterProducts data) {
        this.name = data.name();
        this.description = data.description();
        this.value = data.value();
        this.type = data.type();
    }
}
