package com.CaffeinatedPotatoes.transactionmicroservices.services;

import com.CaffeinatedPotatoes.transactionmicroservices.exceptions.AlreadyExistsException;
import com.CaffeinatedPotatoes.transactionmicroservices.model.Cart;
import com.CaffeinatedPotatoes.transactionmicroservices.model.CartItem;
import com.CaffeinatedPotatoes.transactionmicroservices.payload.AddItemToCart;
import com.CaffeinatedPotatoes.transactionmicroservices.payload.CartItemRequest;
import com.CaffeinatedPotatoes.transactionmicroservices.repositories.CartItemRepository;
import com.CaffeinatedPotatoes.transactionmicroservices.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;
    private CartItemRepository cartItemRepository;

    public CartItem addItemToCart(AddItemToCart addItemToCart){
        //Generates a new cart if it doesn't exist
        if (!cartRepository.existsCartByUserIdIsAndActiveCartIs(addItemToCart.getUserId(), true)){
            Cart newCart = new Cart();
            newCart.setActiveCart(true);
            newCart.setUserId(addItemToCart.getUserId());
            cartRepository.save(newCart);
        }

        Cart cart = cartRepository.getCartByUserIdIsAndActiveCartIs(addItemToCart.getUserId(), true);

        //Does item already exist in cart?
        if (!cartItemRepository.existsCartItemByCartIdIsAndItemIdIs(cart.getId(), addItemToCart.getListedItemId())){
            CartItem cartItem = new CartItem();
            cartItem.setCartId(cart.getId());
            cartItem.setItemId(addItemToCart.getListedItemId());
            cartItem.setQuantity(addItemToCart.getQuantity());
            return cartItemRepository.save(cartItem);
        } else {
            //Throw an exception for item already existing
            throw new AlreadyExistsException("Item id:" + addItemToCart.getListedItemId() + " already exists in your cart");
        }

    }

    public void removeCartItem(CartItemRequest cartItemRequest){
        cartItemRepository.deleteById(cartItemRequest.getCartItemId());
    }


}
