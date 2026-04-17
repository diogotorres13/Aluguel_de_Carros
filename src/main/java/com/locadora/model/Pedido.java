package com.locadora.model;

import io.micronaut.core.annotation.Introspected;
import javax.persistence.*;

@Entity
@Introspected
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Carro carro;

    private String dataInicio;
    private String dataFim;
    private Double valorTotal;
    
    private String status = "PENDENTE"; 
    private String parecerAgente;

    public Pedido() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Carro getCarro() { return carro; }
    public void setCarro(Carro carro) { this.carro = carro; }
    public String getDataInicio() { return dataInicio; }
    public void setDataInicio(String dataInicio) { this.dataInicio = dataInicio; }
    public String getDataFim() { return dataFim; }
    public void setDataFim(String dataFim) { this.dataFim = dataFim; }
    public Double getValorTotal() { return valorTotal; }
    public void setValorTotal(Double valorTotal) { this.valorTotal = valorTotal; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getParecerAgente() { return parecerAgente; }
    public void setParecerAgente(String parecerAgente) { this.parecerAgente = parecerAgente; }
}