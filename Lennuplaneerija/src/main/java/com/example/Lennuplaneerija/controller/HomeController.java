package com.example.Lennuplaneerija.controller;

import com.example.Lennuplaneerija.model.Lennud;
import com.example.Lennuplaneerija.service.LennudService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    public final LennudService lennudService;

    public HomeController(LennudService lennudService) {
        this.lennudService = lennudService;
    }

    @GetMapping("/")
    public String home(Model model){
        return "home";
    }

    @GetMapping("/broneeri")
    public String broneeri(Model model){
        List<Lennud> lennudList = lennudService.getKõikLennud();
        model.addAttribute("lennudList", lennudList);
        return "broneeri";
    }

    @GetMapping("/istekohad")
    public String istekohad(){
        return "istekohad";
    }

}
