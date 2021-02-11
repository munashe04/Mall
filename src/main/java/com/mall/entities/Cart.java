package com.mall.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Cart")
@AllArgsConstructor
@Data
@NoArgsConstructor

public class Cart {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID", columnDefinition = "VARCHAR(40)")
    private String id;
    private String name;
    private String colour;
    private int numberOfWheels;
    private String dateIssued;
    public Cart(String name,String id){
        this.name = name;
        this.id = id;
    }


    @OneToMany(mappedBy = "cart",
            cascade = CascadeType.ALL)
    @Column(nullable = false)
    private List<Product> products = new ArrayList<>();

    @JsonManagedReference
    public List<Product> getProduct() {
        return products;
    }
    public void setProduct(List<Product> product) {
        this.products = product;
    }

}
