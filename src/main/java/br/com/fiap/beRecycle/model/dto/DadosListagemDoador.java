package br.com.fiap.beRecycle.model.dto;

import br.com.fiap.beRecycle.model.entity.Doador;

public record DadosListagemDoador(
        Long id,
        String nome,
        String endereco,
        String telefone,
        String email,
        String cnpj
) {
    public DadosListagemDoador(Doador doador) {
        this (
                doador.getId(),
                doador.getNome(),
                doador.getEndereco(),
                doador.getTelefone(),
                doador.getEmail(),
                doador.getCnpj()
        );
    }
}
