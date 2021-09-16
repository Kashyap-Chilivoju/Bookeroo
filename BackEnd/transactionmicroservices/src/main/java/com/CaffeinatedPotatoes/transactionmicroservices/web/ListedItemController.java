package com.CaffeinatedPotatoes.transactionmicroservices.web;

import com.CaffeinatedPotatoes.transactionmicroservices.model.ListedItem;
import com.CaffeinatedPotatoes.transactionmicroservices.payload.LongWrapper;
import com.CaffeinatedPotatoes.transactionmicroservices.repositories.ListedItemRepository;
import com.CaffeinatedPotatoes.transactionmicroservices.services.MapValidationErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/api/inventory")
public class ListedItemController {

    @Autowired
    private ListedItemRepository listedItemRepository;
    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @GetMapping("/getListedItemsForBookId")
    public ResponseEntity<?> getListedItemsForBookId(@Valid @RequestBody LongWrapper longWrapper, BindingResult bindingResult){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(bindingResult);
        if(errorMap != null) {
            return errorMap;
        }

        ArrayList<ListedItem> listedItemArrayList = listedItemRepository.findAllByBookIdIs(longWrapper.getLongValue());

        //Returning 404 if list is empty
        if (listedItemArrayList.size() == 0){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(listedItemArrayList, HttpStatus.OK);
    }
}
