package com.buyfurn.service;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buyfurn.model.Cart;
import com.buyfurn.model.Product;
import com.buyfurn.model.User;
import com.buyfurn.repository.CartRepostitory;
import com.buyfurn.repository.ProductRepository;

@Service
public class CartService {

    @Autowired
    CartRepostitory cartRepostitory;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserService userService;

    public Cart addToCart(Principal principal, Long productId) {
        Product product = productRepository.findById(productId).get();
        String username = principal.getName();
        User user = userService.getUser(username);

        if (user != null && product != null) {
            Cart cart = new Cart(product, user);
            cartRepostitory.save(cart);
            return cart;
        }

        return null;
    }
  
    public List<Cart> getCartDetails(Principal principal){
    	
    	if(principal!=null) {
    		String username = principal.getName();
    		User user = userService.getUser(username);
    		if(user!=null) {
    			return cartRepostitory.findByUser(user);
    		}
    	}
        return null;
    }

}
