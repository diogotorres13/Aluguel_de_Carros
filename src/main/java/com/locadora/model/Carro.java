package com.locadora.model;

import io.micronaut.core.annotation.Introspected;
import javax.persistence.*;

@Entity
@Introspected // OBRIGATÓRIO: Sem isso, o erro de "missing compilation time query" acontece
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String marca;
    private String modelo;
    private String ano;
    private String placa;
    private String matricula;

    public Carro() {}

    // Getters e Setters (Certifique-se de que TODOS existem)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getAno() { return ano; }
    public void setAno(String ano) { this.ano = ano; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
}