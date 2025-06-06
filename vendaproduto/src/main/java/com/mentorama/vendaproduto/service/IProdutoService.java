package com.mentorama.vendaproduto.service;

import com.mentorama.vendaproduto.entities.Produto;

import java.util.List;

public interface IProdutoService {
    
    List<Produto> findAll(String produto);
    Produto findById(Integer id);
    Integer add(final Produto produto);
}
