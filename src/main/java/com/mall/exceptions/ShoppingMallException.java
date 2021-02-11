package com.mall.exceptions;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingMallException {
	private  String message;
	private  int httpStatus;
	private ZonedDateTime timestamp;

}
