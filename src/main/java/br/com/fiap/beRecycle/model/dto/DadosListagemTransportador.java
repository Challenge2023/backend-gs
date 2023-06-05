package br.com.fiap.beRecycle.model.dto;

import br.com.fiap.beRecycle.model.entity.Doador;
import br.com.fiap.beRecycle.model.entity.Transportador;

public record DadosListagemTransportador(
        Long id,
        String nome,
        String endereco,
        String telefone,
        String email,
        String cnh,
        String placaVeiculo
) {
    public DadosListagemTransportador(Transportador doador) {
        this (
                doador.getId(),
                doador.getNome(),
                doador.getEndereco(),
                doador.getTelefone(),
                doador.getEmail(),
                doador.getCnh(),
                doador.getPlacaVeiculo()
        );
    }
}
