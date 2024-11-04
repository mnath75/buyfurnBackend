package com.buyfurn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buyfurn.model.Cart;
import com.buyfurn.model.User;

public interface CartRepostitory extends JpaRepository<Cart, Long> {
		public List<Cart> findByUser(User user);
}
