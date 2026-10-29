package com.example.projeto_spring.services;

import org.springframework.stereotype.Service;

@Service
public class PedidoFacade {

    private final EstoqueService estoqueService;
    private final PagamentoService pagamentoService;
    private final ConfirmacaoService confirmacaoService;

    public PedidoFacade(
            EstoqueService estoqueService,
            PagamentoService pagamentoService,
            ConfirmacaoService confirmacaoService
    ) {
        this.estoqueService = estoqueService;
        this.pagamentoService = pagamentoService;
        this.confirmacaoService = confirmacaoService;
    }

    public void finalizarPedido(Long produtoId) {
        estoqueService.verificarEstoque(produtoId);
        pagamentoService.processarPagamento();
        confirmacaoService.confirmarPedido();
    }
}
