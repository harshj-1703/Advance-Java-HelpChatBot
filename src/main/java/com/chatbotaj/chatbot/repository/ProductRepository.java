package com.chatbotaj.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.chatbotaj.chatbot.models.ProductInformations;

public interface ProductRepository extends JpaRepository<ProductInformations, Integer> {
    // define method to find customer by customer_id
    ProductInformations findByProductId(@Param("productId") String productId);
}
