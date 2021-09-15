package com.CaffeinatedPotatoes.bookmicroservices.Repositories;

import com.CaffeinatedPotatoes.bookmicroservices.model.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ReviewRepository extends CrudRepository<Review, Long> {

    Review getReviewById(Long id);
    ArrayList<Review> findAllByBookIdIs(Long bookId);
}
