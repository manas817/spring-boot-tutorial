package com.springboot.myapp.controller;

import com.springboot.myapp.entity.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ValidationController {

    @GetMapping("/customerform")
    public String customerform(Model theModel){
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @PostMapping("/processform")
    public String confirmpage(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult){
        if(theBindingResult.hasErrors()){
            return "customer-form";
        }
        return "customer-confirmation";
    }
}
