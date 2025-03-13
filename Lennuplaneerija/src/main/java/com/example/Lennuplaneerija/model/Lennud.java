package com.example.Lennuplaneerija.model;

import jakarta.persistence.*;

@Entity(name="Lennud")
@Table(name="lennud")
public class Lennud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String sihtkoht;
    private String lähtekoht;
    private String kuupaev;
    private String kellaaeg;
    private double hind;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSihtkoht() {
        return sihtkoht;
    }

    public void setSihtkoht(String sihtkoht) {
        this.sihtkoht = sihtkoht;
    }

    public String getLähtekoht() {
        return lähtekoht;
    }

    public void setLähtekoht(String lähtekoht) {
        this.lähtekoht = lähtekoht;
    }

    public String getKuupaev() {
        return kuupaev;
    }

    public void setKuupaev(String kuupaev) {
        this.kuupaev = kuupaev;
    }

    public String getKellaaeg() {
        return kellaaeg;
    }

    public void setKellaaeg(String kellaaeg) {
        this.kellaaeg = kellaaeg;
    }

    public double getHind() {
        return hind;
    }

    public void setHind(double hind) {
        this.hind = hind;
    }


}
