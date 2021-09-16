package com.CaffeinatedPotatoes.transactionmicroservices.repositories;

import com.CaffeinatedPotatoes.transactionmicroservices.model.ListedItem;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ListedItemRepository extends CrudRepository<ListedItem, Long> {

    ArrayList<ListedItem> findAllByBookIdIs(Long bookId);

}
