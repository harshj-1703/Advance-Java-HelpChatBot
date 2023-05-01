package com.chatbotaj.chatbot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chatbotaj.chatbot.models.CustomerInformations;
import com.chatbotaj.chatbot.models.ProductInformations;
import com.chatbotaj.chatbot.models.TrackInformations;
import com.chatbotaj.chatbot.repository.CustomerRepository;
import com.chatbotaj.chatbot.repository.ProductRepository;
import com.chatbotaj.chatbot.repository.TrackRepository;

@Controller
@RequestMapping(path = "/chat")
public class TrackController {
    @Autowired
    private TrackRepository trackRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(path = "/trackinfo")
    public String productinfo(@RequestParam(name = "", required = true) String track_no, Model model,
            RedirectAttributes redirectAttributes) {
        TrackInformations trackInformations = trackRepository.findByTrackId(track_no);
        if (trackInformations == null) {
            redirectAttributes.addFlashAttribute("message",
                    "No Track Record Found for Track ID : " + track_no);
            System.out.println("No Track Record Found for Track ID : " + track_no);
        } else {
            redirectAttributes.addFlashAttribute("trackid", track_no);
            redirectAttributes.addFlashAttribute("productid", trackInformations.getProductId());

            // product info
            ProductInformations productInformations = productRepository
                    .findByProductId(trackInformations.getProductId());
            redirectAttributes.addFlashAttribute("productname", productInformations.getProductName());
            redirectAttributes.addFlashAttribute("productdescription", productInformations.getProductDescription());

            // customer info
            CustomerInformations customerInformations = customerRepository
                    .findByCustomerId(trackInformations.getCustomerId());
            redirectAttributes.addFlashAttribute("customername", customerInformations.getName());
            redirectAttributes.addFlashAttribute("customeraddress", customerInformations.getAddress());

            redirectAttributes.addFlashAttribute("customerid", trackInformations.getCustomerId());
            redirectAttributes.addFlashAttribute("totalquantity",
                    Integer.parseInt(trackInformations.getTotalQuantity()));
            redirectAttributes.addFlashAttribute("totalprice", Integer.parseInt(trackInformations.gettotalPrice()));
            redirectAttributes.addFlashAttribute("productfrom", trackInformations.getProductFrom());
            redirectAttributes.addFlashAttribute("deliveryaddress", trackInformations.getDeliveryAddress());
            redirectAttributes.addFlashAttribute("productcurrentlocation",
                    trackInformations.getProductCurrentLocation());
            redirectAttributes.addFlashAttribute("purchasedate", trackInformations.getPurchaseDate());
            redirectAttributes.addFlashAttribute("deliveryestimateddate", trackInformations.getDeliveryEstimatedDate());
            redirectAttributes.addFlashAttribute("status", trackInformations.getStatus());
        }
        return "redirect:/chat/ask?input_number=3";
    }
}
