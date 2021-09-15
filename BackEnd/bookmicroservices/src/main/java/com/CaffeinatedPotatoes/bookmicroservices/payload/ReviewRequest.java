package com.CaffeinatedPotatoes.bookmicroservices.payload;

public class ReviewRequest {

    private String reviewId;

    public String getReviewId() {
        return reviewId;
    }

    public Long getReviewIdLong(){
        return Long.parseLong(reviewId);
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

}
