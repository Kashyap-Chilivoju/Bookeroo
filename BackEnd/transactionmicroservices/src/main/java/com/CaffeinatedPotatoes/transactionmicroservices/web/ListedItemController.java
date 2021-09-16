package com.CaffeinatedPotatoes.transactionmicroservices.web;

import com.CaffeinatedPotatoes.transactionmicroservices.model.ListedItem;
import com.CaffeinatedPotatoes.transactionmicroservices.payload.LongWrapper;
import com.CaffeinatedPotatoes.transactionmicroservices.repositories.ListedItemRepository;
import com.CaffeinatedPotatoes.transactionmicroservices.services.MapValidationErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.ArrayList;

public class ListedItemController {

    @Autowired
    private ListedItemRepository listedItemRepository;
    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @GetMapping
    public ResponseEntity<?> getListedItemsForBookId(@Valid @RequestBody LongWrapper longWrapper, BindingResult bindingResult){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(bindingResult);
        if(errorMap != null) {
            return errorMap;
        }

        ArrayList<ListedItem> listedItemArrayList = listedItemRepository.findAllByBookIdIs(longWrapper.getLongValue());
        return new ResponseEntity<>(listedItemArrayList, HttpStatus.OK);
    }
}
