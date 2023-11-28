package com.rohitk.service;

import com.rohitk.exception.ProductException;
import com.rohitk.model.Cart;
import com.rohitk.model.CartItem;
import com.rohitk.model.User;
import com.rohitk.request.AddItemRequest;

public interface CartService {

	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);
}
