package com.example.Lennuplaneerija;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public String longin(){
        return "Võid sisse logida";
    }
}
