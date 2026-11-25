package com.seduc2.ranking_naruto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String jinchuruki;
    @NotBlank
    private String kage;
    @NotBlank
    private String sexo;
    @NotBlank
    private String nukenin;
    @NotBlank
    private String elemento;
    @NotBlank
    private String vila;

    public Ranking(Long id, String nome, String jinchuruki, String kage, String sexo, String nukenin, String elemento, String vila) {
        this.id = id;
        this.nome = nome;
        this.jinchuruki = jinchuruki;
        this.kage = kage;
        this.sexo = sexo;
        this.nukenin = nukenin;
        this.elemento = elemento;
        this.vila = vila;
    }

    public Ranking() {
    }

    public Ranking(String nome, String jinchuruki, String kage, String sexo, String nukenin, String elemento, String vila) {
        this.nome = nome;
        this.jinchuruki = jinchuruki;
        this.kage = kage;
        this.sexo = sexo;
        this.nukenin = nukenin;
        this.elemento = elemento;
        this.vila = vila;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJinchuruki() {
        return jinchuruki;
    }

    public void setJinchuruki(String jinchuruki) {
        this.jinchuruki = jinchuruki;
    }

    public String getKage() {
        return kage;
    }

    public void setKage(String kage) {
        this.kage = kage;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNukenin() {
        return nukenin;
    }

    public void setNukenin(String nukenin) {
        this.nukenin = nukenin;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }
}
