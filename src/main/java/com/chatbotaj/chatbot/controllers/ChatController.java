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
        if (chat == null || chat == "" || Integer.parseInt(chat) > 3 || Integer.parseInt(chat) < 1) {
            return "Press 1 : if you want to know your informations\nPress 2 : if youwant to know your product details\nPress 3 : if you want to know your product track status";
        } else {
            return "inputed";
        }
    }
}
