package com.buyfurn.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.buyfurn.model.Cart;
import com.buyfurn.service.CartService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/addToCart/{productId}")
    public Cart addToCart(Principal principal, @PathVariable Long productId) {
        return cartService.addToCart(principal, productId);
    }
    
    
    @GetMapping("/getCartDetails")
    public List<Cart> getCartDetails(Principal principal) {
    	return cartService.getCartDetails(principal);
    }
   

}
