package com.springboot.myapp.controller;

import com.springboot.myapp.entity.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ValidationController {

    // add a initbinder.... to convert trim input strings
    // remove leading and trailing whitespaces
    // resolve issue for our validation

    // initbinder pre-processes all web request coming to our controllers
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        // removes leading and trailing zeros in string.
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/customerform")
    public String customerform(Model theModel){
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @PostMapping("/processform")
    public String confirmpage(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult){

        System.out.println("Student lastName: |" + theCustomer.getLastName() + "|");
        if(theBindingResult.hasErrors()){
            return "customer-form";
        }
        return "customer-confirmation";
    }
}
