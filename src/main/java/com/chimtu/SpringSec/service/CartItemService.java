package com.chimtu.SpringSec.service;

import com.chimtu.SpringSec.model.*;
import com.chimtu.SpringSec.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartItemService {
    @Autowired
    private CartItemRepository cartItemRepository;

    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    public Optional<CartItem> getCartItemById(Long id) {
        return cartItemRepository.findById(id);
    }

    public CartItem createCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public CartItem updateCartItem(Long id, CartItem cartItemDetails) {
        CartItem cartItem = cartItemRepository.findById(id).orElseThrow(() -> new RuntimeException("CartItem not found"));
        cartItem.setCart(cartItemDetails.getCart());
        cartItem.setProduct(cartItemDetails.getProduct());
        cartItem.setQuantity(cartItemDetails.getQuantity());
        return cartItemRepository.save(cartItem);
    }

    public void deleteCartItem(Long id) {
        cartItemRepository.deleteById(id);
    }
}
