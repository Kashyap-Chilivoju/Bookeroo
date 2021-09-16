package com.CaffeinatedPotatoes.transactionmicroservices.repositories;

import com.CaffeinatedPotatoes.transactionmicroservices.model.TransactedItem;
import org.springframework.data.repository.CrudRepository;

public interface TransactedItemRepository extends CrudRepository<TransactedItem, Long> {
}
