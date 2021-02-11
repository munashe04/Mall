package com.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mall.dto.CartRequestDto;
import com.mall.dto.CartResponseDto;
import com.mall.entities.Cart;
import com.mall.service.CartService;


@RestController
@RequestMapping("ShoppingMall/Cart")
public class CartController {
	 
	 @Autowired
	 CartService serv;
		
	
	 @PostMapping
	 public CartResponseDto saveCart( @RequestBody CartRequestDto cartDto) {
		return serv.saveCart(cartDto);
	 }
	 
	@GetMapping
	 public List<CartResponseDto> getAll() {
		return serv.allCarts();
	 }
	 
	 @GetMapping(path ="{id}")
	 public CartResponseDto getById(@PathVariable ("id") String id){
		 return serv.getCartById(id);
	 }
	 @PutMapping(path ="{id}")
	 public CartResponseDto updateById(@PathVariable ("id") String id,@RequestBody CartRequestDto cartDto) {
		 System.out.println("Controller");
		return serv.updateCartById(id,cartDto);
	 }
	 @DeleteMapping(path ="{id}")
			 public CartResponseDto deleteById(@PathVariable ("id") String id){
				return serv.deleteCartById(id);
			 }
	

}