package com.mentorama.vendaproduto.entities;

public class Produto {
    
    private Integer id;
    private String nomeProduto;
    private Integer quantidadeProduto;
    private Double valorProduto = 0.0;
    private Double descontoMaximoPermitido = 0.0;
    
    public Produto(){}
    
    public Produto(Integer id, 
                   String nomeProduto, 
                   Integer quantidadeProduto, 
                   Double valorProduto,
                   Double descontoMaximoPermitido){
        
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
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

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
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
