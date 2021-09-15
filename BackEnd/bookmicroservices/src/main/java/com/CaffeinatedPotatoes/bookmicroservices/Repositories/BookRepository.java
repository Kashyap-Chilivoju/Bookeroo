package com.CaffeinatedPotatoes.bookmicroservices.Repositories;

import com.CaffeinatedPotatoes.bookmicroservices.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

    Book getBookById(Long id);
    ArrayList<Book> findBooksByTitleContains(String searchQuery);
    ArrayList<Book> findAll();
    
}
