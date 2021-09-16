package com.CaffeinatedPotatoes.transactionmicroservices.web;

import com.CaffeinatedPotatoes.transactionmicroservices.model.CartItem;
import com.CaffeinatedPotatoes.transactionmicroservices.payload.AddItemToCart;
import com.CaffeinatedPotatoes.transactionmicroservices.payload.CartItemRequest;
import com.CaffeinatedPotatoes.transactionmicroservices.repositories.CartItemRepository;
import com.CaffeinatedPotatoes.transactionmicroservices.repositories.CartRepository;
import com.CaffeinatedPotatoes.transactionmicroservices.services.CartService;
import com.CaffeinatedPotatoes.transactionmicroservices.services.MapValidationErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CartItemRepository cartItemRepository;
    @Autowired
    private CartService cartService;
    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    //Call cartService to add item to cart
    @PostMapping("/addItemToCart")
    public ResponseEntity<?> addItemToCart(@Valid @RequestBody AddItemToCart addItemToCart, BindingResult bindingResult){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(bindingResult);
        if(errorMap != null) {
            return errorMap;
        }


        CartItem addedCartItem = cartService.addItemToCart(addItemToCart);
        return new ResponseEntity<>(addedCartItem , HttpStatus.OK);
    }

    //Calls cartService to remove cart item
    @PostMapping("/removeItemFromCart")
    public ResponseEntity<?> removeItemFromCart(@Valid @RequestBody CartItemRequest cartItemRequest, BindingResult bindingResult){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(bindingResult);
        if(errorMap != null) {
            return errorMap;
        }

        cartService.removeCartItem(cartItemRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
