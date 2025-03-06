package com.example.Lennuplaneerija.model;

import jakarta.persistence.*;

@Entity(name="Lennud")
@Table(name="lennud")
public class Lennud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "sihtkoht")
    private String sihtkoht;

    @Column(name = "lähtekoht")
    private String lähtekoht;

    @Column(name = "kuupäev")
    private String kuupäev;

    @Column(name = "kellaaeg")
    private String kellaaeg;

    @Column(name = "hind")
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

    public String getKuupäev() {
        return kuupäev;
    }

    public void setKuupäev(String kuupäev) {
        this.kuupäev = kuupäev;
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
