package com.mall.dto;

import java.util.Date;

import lombok.*;
import org.springframework.stereotype.Component;

import com.mall.entities.Cart;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto {
	private Cart cart;
	private String name;
	private double price;
	private Date dateOfPurchase;
}
