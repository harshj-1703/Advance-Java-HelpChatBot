package com.chatbotaj.chatbot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
@RequestMapping(path = "/chat")
public class ChatController {
    @GetMapping(path = "/")
    public String all(@RequestParam(name = "", required = false) String chat) {
        if (chat == null || chat.isEmpty()) {
            return "Press 1 : if you want to know your informations\nPress 2 : if youwant to know your product details\nPress 3 : if you want to know your product track status";
        } else {
            try {
                int chatNumber = Integer.parseInt(chat);
                if (chatNumber < 1 || chatNumber > 3) {
                    return "Invalid input. Please enter a number between 1 and 3.";
                } else {
                    return "Input is valid: " + chat;
                }
            } catch (NumberFormatException e) {
                return "Invalid input. Please enter a valid number between 1 and 3.";
            }
        }
    }

}
