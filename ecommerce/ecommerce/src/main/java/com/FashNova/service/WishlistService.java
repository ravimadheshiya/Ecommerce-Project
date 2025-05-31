package com.FashNova.service;


import com.FashNova.exception.WishlistNotFoundException;
import com.FashNova.model.Product;
import com.FashNova.model.User;
import com.FashNova.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

