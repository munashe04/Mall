package com.mall.dto;

import lombok.*;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartRequestDto {
	private String id;
	private String name;
	private String colour;
	private int numberOfWheels;

		
	}
	
	

