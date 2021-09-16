package com.CaffeinatedPotatoes.transactionmicroservices.payload;

public class CartItemRequest {
    private Long cartItemId;

    public Long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

}
