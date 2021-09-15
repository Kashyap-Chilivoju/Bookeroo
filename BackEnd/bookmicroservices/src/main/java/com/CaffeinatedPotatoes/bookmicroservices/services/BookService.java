package com.CaffeinatedPotatoes.bookmicroservices.services;

import com.CaffeinatedPotatoes.bookmicroservices.Repositories.BookRepository;
import com.CaffeinatedPotatoes.bookmicroservices.exceptions.BookAlreadyExistsException;
import com.CaffeinatedPotatoes.bookmicroservices.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book newBook){
        try {
            return bookRepository.save(newBook);
        } catch (Exception e) {
            throw new BookAlreadyExistsException("Book '"+newBook.getTitle()+"' already exists");
        }
    }

}
