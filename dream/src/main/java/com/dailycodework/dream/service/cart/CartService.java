package com.dailycodework.dream.service.cart;

import com.dailycodework.dream.exceptions.ResourceNotFoundException;
import com.dailycodework.dream.model.Cart.Cart;
import com.dailycodework.dream.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CartService implements ICartService {
    private  final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;

    private IRepository<Cart> cartiRepository;

    @Override
    public Cart getCart(Long id) {
        Cart cart = cartRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cart not found"));
        BigDecimal totalAmount = cart.getTotalAmount();
        cart.setTotalAmount(totalAmount);
        return cartRepository.save(cart);
    }

    @Override
    public void clearCart(Long id) {
        Cart cart = getCart(id);
        cartItemRepository.deleteAllByCartId(id);
        cart.getItems().clear();
        cartRepository.deleteById(id);
    }

    @Override
    public BigDecimal getTotalPrice(Long id) {
        return null;
    }

    @Override
    public Long initializeNewCart() {
        return 0L;
    }

    @Override
    public Cart getCartByUserId(Long userId) {
        return null;
    }
}
