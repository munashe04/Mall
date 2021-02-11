package com.mall.dto;

import java.util.Date;

import com.mall.entities.Cart;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDto {
	private String id;
	private String name;
	private double price;
	
}
