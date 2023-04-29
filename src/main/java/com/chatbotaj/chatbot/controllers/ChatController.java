package com.chatbotaj.chatbot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
// @RestController
@RequestMapping(path = "/chat")
public class ChatController {

    @GetMapping(path = "")
    public String redirect() {
        return "redirect:/chat/";
    }

    @GetMapping(path = "/ask")
    public String ask(@RequestParam(name = "", required = true) String input_number,
            RedirectAttributes redirectAttributes) {
        if (input_number == null || input_number.isEmpty()) {
            return "redirect:/chat/";
        } else {
            try {
                int chatNumber = Integer.parseInt(input_number);
                if (chatNumber < 1 || chatNumber > 3) {
                    redirectAttributes.addFlashAttribute("errorMessage",
                            "Invalid input. Please enter a number between 1 and 3.");
                    return "redirect:/chat/";
                } else {
                    if (chatNumber == 1) {
                        return "informations";
                    }
                    if (chatNumber == 2) {
                        return "productdetails";
                    } else {
                        return "producttrack";
                    }
                }
            } catch (NumberFormatException e) {
                redirectAttributes.addFlashAttribute("errorMessage", "Invalid input. Please enter a valid number.");
                return "redirect:/chat/";
            }
        }
    }

    @GetMapping(path = "/")
    public String index(@ModelAttribute("errorMessage") String errorMessage, Model model) {
        model.addAttribute("errorMessage", errorMessage);
        return "index";
    }

}
