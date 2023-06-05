package br.com.fiap.beRecycle.model.dto;

import br.com.fiap.beRecycle.model.entity.Doacao;
import br.com.fiap.beRecycle.model.entity.Status;

import java.time.LocalDateTime;

public record DadosListagemDoacao(
        Long id,
        LocalDateTime data,
        Status status,
        Long doador,
        Long beneficiario
) {

    public DadosListagemDoacao(Doacao doacao) {
        this (
                doacao.getId(),
                doacao.getData(),
                doacao.getStatus(),
                doacao.getDoador(),
                doacao.getBeneficiario()
        );
    }
}
