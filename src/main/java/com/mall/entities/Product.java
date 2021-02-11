package com.mall.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID", columnDefinition = "VARCHAR(40)")
    private String id;
	private String name;
	private double price;
	private String dateOfPurchase;
	@ManyToOne
	@JoinColumn(name = "cartNumber")
	private Cart cart;
	
	@JsonBackReference
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	
	
}
