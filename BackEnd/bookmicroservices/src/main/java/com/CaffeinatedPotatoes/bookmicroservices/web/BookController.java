package com.CaffeinatedPotatoes.bookmicroservices.web;

import com.CaffeinatedPotatoes.bookmicroservices.Repositories.BookRepository;
import com.CaffeinatedPotatoes.bookmicroservices.model.Book;
import com.CaffeinatedPotatoes.bookmicroservices.payload.BookRequest;
import com.CaffeinatedPotatoes.bookmicroservices.payload.SearchRequest;
import com.CaffeinatedPotatoes.bookmicroservices.services.BookService;
import com.CaffeinatedPotatoes.bookmicroservices.services.MapValidationErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @GetMapping ("/getAll")
    public ResponseEntity<?> getAll(@Valid @RequestBody (required = false) String optional, BindingResult result){
        ArrayList<Book> bookArrayList = bookRepository.findAll();

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) {
            return errorMap;
        }

        return new ResponseEntity<>(bookArrayList, HttpStatus.FOUND);
    }

    @GetMapping ("/getBookByID")
    public ResponseEntity<?> getBookByID(@Valid @RequestBody BookRequest bookRequest, BindingResult result){
        Book returnedBook = bookRepository.getBookById(bookRequest.getBookIdLong());

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) {
            return errorMap;
        }

        return new ResponseEntity<>(returnedBook, HttpStatus.OK);
    }

    @GetMapping ("/getBooksByTitle")
    public ResponseEntity<?> getBooksByTitle(@Valid @RequestBody SearchRequest searchRequest, BindingResult result){
        ArrayList<Book> returnedBooks = bookRepository.findBooksByTitleContains(searchRequest.getSearchQuery());

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) {
            return errorMap;
        }

        return new ResponseEntity<>(returnedBooks, HttpStatus.OK);
    }

    @PutMapping("/createNewBook")
    public ResponseEntity<?> createNewBook(@Valid @RequestBody Book book, BindingResult result){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) {
            return errorMap;
        }

        Book newBook = bookService.saveBook(book);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }

    @PatchMapping("/updateBook")
    public ResponseEntity<?> updateBook(@Valid @RequestBody Book book, BindingResult result){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) {
            return errorMap;
        }

        Book updatedBook = bookRepository.save(book);
        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }

    @DeleteMapping("/deleteBook")
    public ResponseEntity<?> deleteBook(@Valid @RequestBody BookRequest bookRequest, BindingResult result){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) {
            return errorMap;
        }

        bookRepository.deleteById(bookRequest.getBookIdLong());
        return new ResponseEntity<>("Deletion successful", HttpStatus.OK);
    }

}
