package com.chatbotaj.chatbot.controllers;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// import com.chatbotaj.chatbot.models.CustomerInformations;
// import com.chatbotaj.chatbot.repository.CustomerRepository;

// @Controller
// // @RestController
// @RequestMapping(path = "/chat")
// public class InfoController {

//     @Autowired
//     private CustomerRepository customerInfoService;

//     @PostMapping(path = "/information")
//     public String info(@RequestParam(name = "", required = true) String info_number, Model model,
//             RedirectAttributes redirectAttributes) {
//         CustomerInformations customerInfo = customerInfoService.findByCustomerId(info_number);
//         if (customerInfo == null) {
//             redirectAttributes.addFlashAttribute("message",
//                     "No Customer Found for Customer ID : " + info_number);
//             System.out.println("No Customer Found for Customer ID : " + info_number);
//         } else {
//             System.out.println(customerInfo.getName());
//             redirectAttributes.addFlashAttribute("customerid", customerInfo.getCustomerId());
//             redirectAttributes.addFlashAttribute("customername", customerInfo.getName());
//             redirectAttributes.addFlashAttribute("customeraddress", customerInfo.getAddress());
//             redirectAttributes.addFlashAttribute("customerstatus", customerInfo.getStatus());
//         }
//         return "redirect:/chat/ask?input_number=1";
//     }
// }

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chatbotaj.chatbot.models.CustomerInformations;
import com.chatbotaj.chatbot.repository.CustomerRepository;

@Controller
@RequestMapping(path = "/chat")
public class InfoController {

    @Autowired
    private CustomerRepository customerInfoService;

    @PostMapping(path = "/information", produces = "application/json")
    public ResponseEntity<Object> info(@RequestParam(name = "info_number") String infoNumber,
            RedirectAttributes redirectAttributes) {
        CustomerInformations customerInfo = customerInfoService.findByCustomerId(infoNumber);
        if (customerInfo == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Customer Found for Customer ID: " + infoNumber);
        } else {
            return ResponseEntity.ok(customerInfo);
        }
    }
}
