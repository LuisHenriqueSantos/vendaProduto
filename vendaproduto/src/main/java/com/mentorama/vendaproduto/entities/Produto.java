package com.mentorama.vendaproduto.entities;

public class Produto {
    
    
    private Integer id;
    private String nomeProduto;
    private Integer quantidadeProduto;
    private Double descontoMaximoPermitido = 0.0;
    
    public Produto(){}
    
    public Produto(Integer id, String nomeProduto, Integer quantidadeProduto, Double descontoMaximoPermitido){
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.descontoMaximoPermitido = descontoMaximoPermitido;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Double getDescontoMaximoPermitido() {
        return descontoMaximoPermitido;
    }

    public void setDescontoMaximoPermitido(Double descontoMaximoPermitido) {
        this.descontoMaximoPermitido = descontoMaximoPermitido;
    }
}
