package br.com.fiap.beRecycle.model.dto;

import br.com.fiap.beRecycle.model.entity.Beneficiario;
import br.com.fiap.beRecycle.model.entity.Doador;

public record DadosListagemBeneficiario(
        Long id,
        String nome,
        String endereco,
        String telefone,
        String email
) {

    public DadosListagemBeneficiario(Beneficiario beneficiario) {
        this (
                beneficiario.getId(),
                beneficiario.getNome(),
                beneficiario.getEndereco(),
                beneficiario.getTelefone(),
                beneficiario.getEmail()
        );
    }
}
