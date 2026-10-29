package com.example.projeto_spring.services;

import org.springframework.stereotype.Service;

@Service
public class EstoqueService {

    public void verificarEstoque(Long produtoId) {
        System.out.println(
                "Estoque verificado para o produto " + produtoId
        );
    }
}