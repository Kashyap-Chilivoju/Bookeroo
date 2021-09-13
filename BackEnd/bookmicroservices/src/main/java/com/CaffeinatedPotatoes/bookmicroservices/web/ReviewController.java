package com.CaffeinatedPotatoes.bookmicroservices.web;

import com.CaffeinatedPotatoes.bookmicroservices.Repositories.ReviewRepository;
import com.CaffeinatedPotatoes.bookmicroservices.model.Review;
import com.CaffeinatedPotatoes.bookmicroservices.payload.BookRequest;
import com.CaffeinatedPotatoes.bookmicroservices.payload.ReviewRequest;
import com.CaffeinatedPotatoes.bookmicroservices.services.MapValidationErrorService;
import com.CaffeinatedPotatoes.bookmicroservices.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/api/review")
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @GetMapping("/getReviewByID")
    public ResponseEntity<?> getReviewByID(@Valid @RequestBody ReviewRequest reviewRequest, BindingResult result){
        Review returnedReview = reviewRepository.getReviewById(reviewRequest.getReviewIdLong());

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) {
            return errorMap;
        }

        return new ResponseEntity<>(returnedReview, HttpStatus.OK);
    }

    @GetMapping("/getReviewByBookID")
    public ResponseEntity<?> getReviewByBookID(@Valid @RequestBody BookRequest BookRequest, BindingResult result){
        ArrayList<Review> reviewList = reviewRepository.findAllByBookIdIs(BookRequest.getBookIdLong());

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) {
            return errorMap;
        }

        return new ResponseEntity<>(reviewList, HttpStatus.OK);
    }

    @PostMapping("/createNewReview")
    public ResponseEntity<?> createNewReview(@Valid @RequestBody Review review, BindingResult result){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        Review newReview = reviewService.saveReview(review);

        if(errorMap != null) {
            return errorMap;
        }

        return new ResponseEntity<>(newReview, HttpStatus.CREATED);
    }

    @PostMapping("/updateReview")
    public ResponseEntity<?> updateReview(@Valid @RequestBody Review review, BindingResult result){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        Review updatedReview = reviewRepository.save(review);

        if(errorMap != null) {
            return errorMap;
        }

        return new ResponseEntity<>(updatedReview, HttpStatus.OK);
    }

    @PostMapping("/deleteReview")
    public ResponseEntity<?> deleteReview(@Valid @RequestBody ReviewRequest reviewRequest, BindingResult result){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        reviewRepository.deleteById(reviewRequest.getReviewIdLong());

        if(errorMap != null) {
            return errorMap;
        }

        return new ResponseEntity<>("Deletion Successful", HttpStatus.OK);
    }

}
