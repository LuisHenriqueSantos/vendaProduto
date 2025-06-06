package com.mentorama.vendaproduto.controllers;

import com.mentorama.vendaproduto.entities.Produto;
import com.mentorama.vendaproduto.service.IProdutoService;
import com.mentorama.vendaproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
    
    @Autowired  
    private IProdutoService produtoService;
    
    @GetMapping
    public List<Produto> findAll(@RequestParam(required = false) String produto){
      return produtoService.findAll(produto);    
    }
    
    @GetMapping("/{id}")
    public Produto findById(@PathVariable("id") Integer id){
        return produtoService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Integer> add(@RequestBody final Produto produto){
        Integer id = produtoService.add(produto);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }
    
    
}
