package com.example.Lennuplaneerija.controller;

import com.example.Lennuplaneerija.model.Lennud;
import com.example.Lennuplaneerija.service.LennudService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LennudController {

    private final LennudService lennudService;

    public LennudController(LennudService lennudService) {
        this.lennudService = lennudService;
    }

    // API meetod, mis käsitleb päringut /lennud
    @GetMapping("/lennud")
    public List<Lennud> getLennud(
            @RequestParam(value = "lähtekoht", required = false) String lähtekoht,
            @RequestParam(value = "sihtkoht", required = false) String sihtkoht) {

        // Kui mõlemad parameetrid on olemas, siis filtrime tulemusi
        if (lähtekoht != null && sihtkoht != null) {
            return lennudService.filtreeriLennud(lähtekoht, sihtkoht);
        } else {
            // Kui ei ole mingeid filtreid, tagastame kõik lennud
            return lennudService.getKõikLennud();
        }
    }
}
