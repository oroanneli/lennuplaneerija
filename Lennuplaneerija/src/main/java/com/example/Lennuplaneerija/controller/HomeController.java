package com.example.Lennuplaneerija.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(@RequestParam(value = "nimi", defaultValue = "") String nimi, Model model){
        String tervita = "Tere, "+nimi;
        model.addAttribute("message", tervita);
        return "home";
    }

}
