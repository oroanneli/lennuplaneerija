package com.example.Lennuplaneerija;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String tervitus(){
        return "Tere tulemast imelisele lennuplaneerija lehele!!";
    }

    @RequestMapping("/sihtkohad")
    public String sihtkohad(){
        return "Saad lennata igale poole";
    }
}
