package com.dailycodework.dream.repository;

import com.dailycodework.dream.model.Cart.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    void deleteAllByCartId(Long id);
}
