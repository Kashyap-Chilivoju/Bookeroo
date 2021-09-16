package com.CaffeinatedPotatoes.transactionmicroservices.repositories;

import com.CaffeinatedPotatoes.transactionmicroservices.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {

    Boolean existsCartByUserIdIsAndActiveCartIs(Long userId, Boolean activeCart);
    Cart getCartByUserIdIsAndActiveCartIs(Long userId, Boolean activeCart);

}
