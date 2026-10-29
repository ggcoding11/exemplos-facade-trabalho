package com.example.projeto_spring.controllers;

import com.example.projeto_spring.services.PedidoFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoFacade pedidoFacade;

    public PedidoController(PedidoFacade pedidoFacade) {
        this.pedidoFacade = pedidoFacade;
    }

    @PostMapping("/{produtoId}")
    public ResponseEntity<String> finalizarPedido(
            @PathVariable Long produtoId
    ) {
        pedidoFacade.finalizarPedido(produtoId);

        return ResponseEntity.ok("Pedido finalizado com sucesso!");
    }
}