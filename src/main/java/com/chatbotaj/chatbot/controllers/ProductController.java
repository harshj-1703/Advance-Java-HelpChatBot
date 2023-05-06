package com.chatbotaj.chatbot.controllers;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// import com.chatbotaj.chatbot.models.ProductInformations;
// import com.chatbotaj.chatbot.repository.ProductRepository;

// @Controller
// @RequestMapping(path = "/chat")
// public class ProductController {
//     @Autowired
//     private ProductRepository productRepository;

//     @PostMapping(path = "/productinfo")
//     public String productinfo(@RequestParam(name = "", required = true) String product_no, Model model,
//             RedirectAttributes redirectAttributes) {
//         ProductInformations productInformations = productRepository.findByProductId(product_no);
//         if (productInformations == null) {
//             redirectAttributes.addFlashAttribute("message",
//                     "No Product Found for Product ID : " + product_no);
//             System.out.println("No Product Found for Product ID : " + product_no);
//         } else {
//             System.out.println(productInformations.getProductName());
//             redirectAttributes.addFlashAttribute("productid", product_no);
//             redirectAttributes.addFlashAttribute("productname", productInformations.getProductName());
//             redirectAttributes.addFlashAttribute("productprice", productInformations.getProductPrice());
//             redirectAttributes.addFlashAttribute("productdescription", productInformations.getProductDescription());
//             redirectAttributes.addFlashAttribute("productstatus", productInformations.getStatus());
//         }
//         return "redirect:/chat/ask?input_number=2";
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

import com.chatbotaj.chatbot.models.ProductInformations;
import com.chatbotaj.chatbot.repository.ProductRepository;

@Controller
@RequestMapping(path = "/chat")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping(path = "/productinfo", produces = "application/json")
    public ResponseEntity<Object> productinfo(@RequestParam(name = "product_no") String productNumber,
            RedirectAttributes redirectAttributes) {
        ProductInformations productInformations = productRepository.findByProductId(productNumber);
        if (productInformations == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No Product Found for Product ID: " + productNumber);
        } else {
            return ResponseEntity.ok(productInformations);
        }
    }
}
