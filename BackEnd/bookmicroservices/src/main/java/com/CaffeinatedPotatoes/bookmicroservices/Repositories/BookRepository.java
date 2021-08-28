package com.CaffeinatedPotatoes.bookmicroservices.Repositories;

import com.CaffeinatedPotatoes.bookmicroservices.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

    Book getById(Long id);
    Book findBooksByTitleContains(String searchQuery);

}
