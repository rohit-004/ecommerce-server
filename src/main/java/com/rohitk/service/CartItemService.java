package com.rohitk.service;

import com.rohitk.exception.CartItemException;
import com.rohitk.exception.UserException;
import com.rohitk.model.Cart;
import com.rohitk.model.CartItem;
import com.rohitk.model.Product;

public interface CartItemService {

	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId,Long id,CartItem cartItem)throws CartItemException,UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size,Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId)throws CartItemException,UserException;
	
	public CartItem findCartItemById(Long cartItemId)throws CartItemException;
}
