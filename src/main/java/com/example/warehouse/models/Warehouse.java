package com.example.warehouse.models;

import com.example.warehouse.dtos.warehouses.DataRegisterWarehouses;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "warehouses")
@Entity(name = "Warehouse")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;

    //@Embedded()
    //private Address address;

    public Warehouse(DataRegisterWarehouses data) {
        this.name = data.name();
        //this.address = new Address(data.address());
    }
}
