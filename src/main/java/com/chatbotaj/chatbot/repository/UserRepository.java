package com.chatbotaj.chatbot.repository;

import org.springframework.data.repository.CrudRepository;

import com.chatbotaj.chatbot.models.Users;

public interface UserRepository extends CrudRepository<Users, Integer> {

}
