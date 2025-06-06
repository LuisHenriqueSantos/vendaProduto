package com.mentorama.vendaproduto.repository;

import com.mentorama.vendaproduto.entities.Produto;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoRepository {
    
    
    private static ProdutoRepository produtoRepository;
    
    public static ProdutoRepository getInstance(){
        if(produtoRepository == null){
            produtoRepository = new ProdutoRepository();
        }
        return produtoRepository;
    }
    
    private final List<Produto> produtos;
    
    public ProdutoRepository(){
        this.produtos = new LinkedList<>();
    }

    public List<Produto> findAll() {
        return produtos;
    }

    public List<Produto> findAll(String produto) {
        return produtos.stream()
                .filter(p -> p.getNomeProduto().toLowerCase().contains(produto.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Produto findById(Integer id) {
        return this.produtos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public int count() {
        return produtos.size();
    }

    public void add(Produto produto) {
        produtos.add(produto);
    }

    public void update(Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId().equals(produto.getId())) {
                produtos.set(i, produto);
                return;
            }
        }
    }

    public void delete(Integer id) {
        produtos.removeIf(p -> p.getId().equals(id));
    }
    
}
