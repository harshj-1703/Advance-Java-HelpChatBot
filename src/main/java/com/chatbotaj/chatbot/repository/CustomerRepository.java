package com.chatbotaj.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.chatbotaj.chatbot.models.CustomerInformations;

public interface CustomerRepository extends JpaRepository<CustomerInformations, Integer> {
    // define method to find customer by customer_id
    CustomerInformations findByCustomerId(@Param("customerId") String customerId);
}
