package com.chatbotaj.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.chatbotaj.chatbot.models.ProductInformations;

public interface ProductRepository extends JpaRepository<ProductInformations, Integer> {

    ProductInformations findByProductId(@Param("productId") String productId);
}
