package com.chatbotaj.chatbot.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "track_info")
public class TrackInformations {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String trackId;

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    private String productId;
    private String customerId;
    private String totalQuantity;
    private String totalPrice;
    private String productFrom;
    private String deliveryAddress;
    private String productCurrentLocation;
    private Date purchaseDate;
    private Date deliveryEstimatedDate;
    private String status;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(String totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String gettotalPrice() {
        return totalPrice;
    }

    public void settotalPrice(String totalPrice) {
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getDeliveryEstimatedDate() {
        return deliveryEstimatedDate;
    }

    public void setDeliveryEstimatedDate(Date deliveryEstimatedDate) {
        this.deliveryEstimatedDate = deliveryEstimatedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method to get purchase date in "dd/MM/yyyy HH:mm:ss" format
    public String getFormattedPurchaseDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return dateFormat.format(this.purchaseDate);
    }

    // Method to get delivery estimated date in "dd/MM/yyyy HH:mm:ss" format
    public String getFormattedDeliveryEstimatedDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return dateFormat.format(this.deliveryEstimatedDate);
    }
}
