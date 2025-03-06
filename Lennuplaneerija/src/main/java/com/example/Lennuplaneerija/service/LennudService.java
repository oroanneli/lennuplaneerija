package com.example.Lennuplaneerija.service;

import com.example.Lennuplaneerija.model.Lennud;
import com.example.Lennuplaneerija.repository.LennudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deliteById(long id){
        lennudRepository.deleteById(id);
    }
}
