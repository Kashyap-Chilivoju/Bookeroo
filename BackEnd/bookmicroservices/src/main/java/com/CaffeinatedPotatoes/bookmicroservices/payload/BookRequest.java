package com.CaffeinatedPotatoes.bookmicroservices.payload;

public class BookRequest {

    private String bookId;

    public String getBookId() {
        return bookId;
    }

    public Long getBookIdLong(){
        return Long.parseLong(bookId);
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

}
