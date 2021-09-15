package com.CaffeinatedPotatoes.bookmicroservices.services;

import com.CaffeinatedPotatoes.bookmicroservices.Repositories.ReviewRepository;
import com.CaffeinatedPotatoes.bookmicroservices.exceptions.AlreadyExistsException;
import com.CaffeinatedPotatoes.bookmicroservices.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public Review saveReview(Review newReview){
        try {
            return reviewRepository.save(newReview);
        } catch (Exception e) {
            throw new AlreadyExistsException("Review '"+newReview.getId()+"' already exists");
        }

    }
}
