package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String home() {
        return "start";
    }

    @PostMapping("/encryption")
    public String encrypt(@RequestParam String sourceText, Model model) {
        model.addAttribute("text", sourceText+"SHIFT");
        return "start";
    }

    @PostMapping("/decryption")
    public String decrypt(@RequestParam String sourceText, Model model) {
        model.addAttribute("text", sourceText+"SHIFT1");
        return "start";
    }
}
