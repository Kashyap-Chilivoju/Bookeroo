package com.CaffeinatedPotatoes.transactionmicroservices.security;

public class SecurityConstant {
    public static final String TRANSACTION_URLS = "/api/transaction/**";
    public static final String H2_URL = "/h2-console/**";
    public static final long EXPIRATION_TIME = 30_000; //30 seconds
}
