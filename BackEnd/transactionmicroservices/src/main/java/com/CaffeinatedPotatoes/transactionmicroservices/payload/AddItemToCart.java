package com.CaffeinatedPotatoes.transactionmicroservices.payload;

public class AddItemToCart {

    private Long userId;
    private Long listedItemId;
    private Integer quantity;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getListedItemId() {
        return listedItemId;
    }

    public void setListedItemId(Long listedItemId) {
        this.listedItemId = listedItemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
