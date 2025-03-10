package com.example.Lennuplaneerija.service;

import com.example.Lennuplaneerija.model.Lennud;
import com.example.Lennuplaneerija.repository.LennudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class LennudService {
    private final LennudRepository lennudRepository;

    public LennudService(LennudRepository lennudRepository) {
        this.lennudRepository = lennudRepository;
    }

    public List<Lennud> getKõikLennud (){
        return (List<Lennud>) lennudRepository.findAll();
    }

    public Optional<Lennud> leiaIDjärgi(long id){
        return lennudRepository.findById(id);
    }

    public Lennud save(Lennud lennud){
        return lennudRepository.save(lennud);
    }

    public void deleteById(long id){
        lennudRepository.deleteById(id);
    }

    private static final Logger logger = LoggerFactory.getLogger(LennudService.class);

    public List<Lennud> filtreeriLennud(String lähtekoht, String sihtkoht) {
        logger.info("Filtreerimine: lähtekoht = {}, sihtkoht = {}", lähtekoht, sihtkoht);

        if (lähtekoht != null && !lähtekoht.isEmpty() && sihtkoht != null && !sihtkoht.isEmpty()) {
            return lennudRepository.findByLähtekohtAndSihtkoht(lähtekoht, sihtkoht);
        } else if (lähtekoht != null && !lähtekoht.isEmpty()) {
            return lennudRepository.findByLähtekoht(lähtekoht);
        } else if (sihtkoht != null && !sihtkoht.isEmpty()) {
            return lennudRepository.findBySihtkoht(sihtkoht);
        } else {
            return lennudRepository.findAll();
        }
    }
}
