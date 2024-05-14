package com.example.journalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/main")
    public String mainPage() {
        return "index.html";
    }
}
