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

    @Column(name = "kuupaev")
    private String kuupaev;

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

    @Override
    public String toString() {
        return "Lennud{" +
                "id=" + id +
                ", sihtkoht='" + sihtkoht + '\'' +
                ", lähtekoht='" + lähtekoht + '\'' +
                ", kuupaev='" + kuupaev + '\'' +
                ", kellaaeg='" + kellaaeg + '\'' +
                ", hind=" + hind +
                '}';
    }

}
