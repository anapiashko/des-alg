package com.example.demo.controllers;

import com.example.demo.services.DES;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final DES desAlgorithm;

    public HomeController(DES desAlgorithm) {
        this.desAlgorithm = desAlgorithm;
    }

    @GetMapping(value = "/")
    public String home() {
        return "start";
    }

    @PostMapping("/encryption")
    public String encrypt(@RequestParam String sourceText, @RequestParam String key, Model model) {
        String cipherText = desAlgorithm.encryption(key, sourceText);
        model.addAttribute("text", cipherText);
        return "start";
    }

    @PostMapping("/decryption")
    public String decrypt(@RequestParam String sourceText, @RequestParam String key, Model model) {
        String plainText = desAlgorithm.decryption(key, sourceText);
        model.addAttribute("text", plainText);
        return "start";
    }
}
