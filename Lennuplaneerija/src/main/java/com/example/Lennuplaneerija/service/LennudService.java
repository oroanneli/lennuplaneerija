package com.example.Lennuplaneerija.service;

import com.example.Lennuplaneerija.model.Lennud;
import com.example.Lennuplaneerija.repository.LennudRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LennudService {
    private final LennudRepository lennudRepository;

    public LennudService(LennudRepository lennudRepository) {
        this.lennudRepository = lennudRepository;
    }

    public List<Lennud> getKõikLennud() {
        return lennudRepository.findAll();
    }

    public List<Lennud> filtreeriLennud(String lähtekoht, String sihtkoht) {
        boolean lähtekohtOnTühi = (lähtekoht == null || lähtekoht.isEmpty() || lähtekoht.equalsIgnoreCase("kõik"));
        boolean sihtkohtOnTühi = (sihtkoht == null || sihtkoht.isEmpty() || sihtkoht.equalsIgnoreCase("kõik"));

        if (!lähtekohtOnTühi && !sihtkohtOnTühi) {
            return lennudRepository.findByLähtekohtAndSihtkoht(lähtekoht, sihtkoht);
        } else if (!lähtekohtOnTühi) {
            return lennudRepository.findByLähtekoht(lähtekoht);
        } else if (!sihtkohtOnTühi) {
            return lennudRepository.findBySihtkoht(sihtkoht);
        } else {
            return lennudRepository.findAll();
        }
    }
}