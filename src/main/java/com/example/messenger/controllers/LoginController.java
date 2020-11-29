package com.example.messenger.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    @GetMapping("/login")
    public String user() {
        return "login";
    }

    @PostMapping("/sign_in")
    public String singIn() {
        return "/user";
    }
}
