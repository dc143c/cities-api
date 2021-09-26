package com.dc143c.cities.api.model;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Country {
    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name="nome_pt")
    private String nome_pt;

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "bacen")
    private Long bacen;

    public Country() {}

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

    public String getNome_pt() {
        return nome_pt;
    }

    public void setNome_pt(String nome_pt) {
        this.nome_pt = nome_pt;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Long getBacen() {
        return bacen;
    }

    public void setBacen(Long bacen) {
        this.bacen = bacen;
    }
}
