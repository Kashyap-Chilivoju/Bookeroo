package com.CaffeinatedPotatoes.transactionmicroservices.payload;

import java.util.Date;

public class TransactionRequest {

    private Long Id;
    private Long userId;
    private Double transactedAmount;
    private Date create_At;
    private Date update_At;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getTransactedAmount() {
        return transactedAmount;
    }

    public void setTransactedAmount(Double transactedAmount) {
        this.transactedAmount = transactedAmount;
    }

    public Date getCreate_At() {
        return create_At;
    }

    public void setCreate_At(Date create_At) {
        this.create_At = create_At;
    }

    public Date getUpdate_At() {
        return update_At;
    }

    public void setUpdate_At(Date update_At) {
        this.update_At = update_At;
    }


}