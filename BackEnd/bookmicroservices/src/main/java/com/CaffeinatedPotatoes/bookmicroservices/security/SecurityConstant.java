package com.CaffeinatedPotatoes.bookmicroservices.security;

public class SecurityConstant {
    public static final String BOOK_URLS = "/api/book/**";
    public static final String REVIEW_URLS = "/api/review/**";
    public static final String H2_URL = "/h2-console/**";
    public static final long EXPIRATION_TIME = 30_000; //30 seconds
}
