package com.locadora.model;

import io.micronaut.core.annotation.Introspected;
import javax.persistence.*;

@Entity
@Introspected // Essencial para o Micronaut gerar as queries de banco
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String profissao;

    // Campos de rendimento exigidos (Máximo 3)
    private String empresa1;
    private Double rendimento1;
    
    private String empresa2;
    private Double rendimento2;
    
    private String empresa3;
    private Double rendimento3;

    public Cliente() {}

    // GETTERS E SETTERS (Devem existir para TODOS os campos acima)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getProfissao() { return profissao; }
    public void setProfissao(String profissao) { this.profissao = profissao; }
    public String getEmpresa1() { return empresa1; }
    public void setEmpresa1(String empresa1) { this.empresa1 = empresa1; }
    public Double getRendimento1() { return rendimento1; }
    public void setRendimento1(Double rendimento1) { this.rendimento1 = rendimento1; }
    public String getEmpresa2() { return empresa2; }
    public void setEmpresa2(String empresa2) { this.empresa2 = empresa2; }
    public Double getRendimento2() { return rendimento2; }
    public void setRendimento2(Double rendimento2) { this.rendimento2 = rendimento2; }
    public String getEmpresa3() { return empresa3; }
    public void setEmpresa3(String empresa3) { this.empresa3 = empresa3; }
    public Double getRendimento3() { return rendimento3; }
    public void setRendimento3(Double rendimento3) { this.rendimento3 = rendimento3; }
}