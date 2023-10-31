package com.wesley.ingresso.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Integer duracaoMinutos;
    @Column(nullable = false)
    private Date dataLancamento;

    public Filme() {

    }

    public Filme(Long id, String nome, Integer duracaoMinutos, Date dataLancamento) {
        this.id = id;
        this.nome = nome;
        this.duracaoMinutos = duracaoMinutos;
        this.dataLancamento = dataLancamento;
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

    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
