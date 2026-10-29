package com.example.projeto_spring.services;

import org.springframework.stereotype.Service;

@Service
public class ConfirmacaoService {

    public void confirmarPedido() {
        System.out.println("Pedido confirmado");
    }
}