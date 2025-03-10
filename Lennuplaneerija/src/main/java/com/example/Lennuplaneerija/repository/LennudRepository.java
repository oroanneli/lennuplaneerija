package com.example.Lennuplaneerija.repository;

import com.example.Lennuplaneerija.model.Lennud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LennudRepository extends JpaRepository<Lennud, Long> {
    List<Lennud> findByLähtekohtAndSihtkoht(String lähtekoht, String sihtkoht);
    List<Lennud> findByLähtekoht(String lähtekoht);
    List<Lennud> findBySihtkoht(String sihtkoht);

}
