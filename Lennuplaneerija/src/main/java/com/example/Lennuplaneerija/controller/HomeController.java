package com.example.Lennuplaneerija.controller;

import com.example.Lennuplaneerija.model.Lennud;
import com.example.Lennuplaneerija.service.LennudService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    public final LennudService lennudService;

    public HomeController(LennudService lennudService) {
        this.lennudService = lennudService;
    }

    @GetMapping("/")
    public String home(@RequestParam(value = "nimi", defaultValue = "") String nimi, Model model){
        //String tervita = "Tere, "+nimi;
        //model.addAttribute("message", tervita);

        List<Lennud> lennudList = lennudService.getKõikLennud();
        model.addAttribute("lennudList", lennudList);

        return "home";
    }

}
