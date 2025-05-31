package com.FashNova.repository;

import com.FashNova.model.Cart;
import com.FashNova.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.FashNova.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
