package com.chatbotaj.chatbot.models;

public class TrackResponse {
    private String trackId;
    private String productId;
    private String productName;
    private String productDescription;
    private String customerName;
    private String customerAddress;
    private String customerId;
    private int totalQuantity;
    private int totalPrice;
    private String productFrom;
    private String deliveryAddress;
    private String productCurrentLocation;
    private String purchaseDate;
    private String deliveryEstimatedDate;
    private String status;

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getProductFrom() {
        return productFrom;
    }

    public void setProductFrom(String productFrom) {
        this.productFrom = productFrom;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getProductCurrentLocation() {
        return productCurrentLocation;
    }

    public void setProductCurrentLocation(String productCurrentLocation) {
        this.productCurrentLocation = productCurrentLocation;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getDeliveryEstimatedDate() {
        return deliveryEstimatedDate;
    }

    public void setDeliveryEstimatedDate(String deliveryEstimatedDate) {
        this.deliveryEstimatedDate = deliveryEstimatedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
