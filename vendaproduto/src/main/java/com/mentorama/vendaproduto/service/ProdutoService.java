package com.mentorama.vendaproduto.service;


import com.mentorama.vendaproduto.entities.Produto;
import com.mentorama.vendaproduto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService implements IProdutoService{
    
    private final ProdutoRepository produtoRepository = ProdutoRepository.getInstance();
    
    public List<Produto> findAll(String produto) {
        if (produto != null) {
            return produtoRepository.findAll(produto);
        }
        return produtoRepository.findAll();
    }

    public Produto findById(Integer id) {
        return produtoRepository.findById(id);
    }

    public Integer add(final Produto produto) {

        if (produto.getId() == null) {
            produto.setId(produtoRepository.count() + 1);
        } else {
            if (produtoRepository.findById(produto.getId()) != null) {
                throw new IllegalArgumentException("ID do produtp já existe.");
            }
        }

        produtoRepository.add(produto);
        return produto.getId();
    }
    
    public void delete(Integer id) {
        produtoRepository.delete(id);
    }
    
}
