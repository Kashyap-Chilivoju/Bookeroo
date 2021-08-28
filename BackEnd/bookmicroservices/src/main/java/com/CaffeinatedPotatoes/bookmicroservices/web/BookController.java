package com.CaffeinatedPotatoes.bookmicroservices.web;

import com.CaffeinatedPotatoes.bookmicroservices.Repositories.BookRepository;
import com.CaffeinatedPotatoes.bookmicroservices.model.Book;
import com.CaffeinatedPotatoes.bookmicroservices.services.MapValidationErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("/getByID")
    public ResponseEntity<?> getBookByID(@Valid @RequestBody Long Id, BindingResult result){
        Book book = bookRepository.getById(Id);

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) {
            return errorMap;
        }


        return new ResponseEntity<Book>(book, HttpStatus.CREATED);
    }
}
