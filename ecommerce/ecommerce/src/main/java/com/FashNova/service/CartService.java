package com.FashNova.service;

import com.FashNova.exception.ProductException;
import com.FashNova.model.Cart;
import com.FashNova.model.CartItem;
import com.FashNova.model.Product;
import com.FashNova.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
