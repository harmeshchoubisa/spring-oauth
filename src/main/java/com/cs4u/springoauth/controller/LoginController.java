package com.cs4u.springoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/")
    public String unsecured() {
        return "Sorry, unsecured website";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Ah, now it's secured";
    }
}
