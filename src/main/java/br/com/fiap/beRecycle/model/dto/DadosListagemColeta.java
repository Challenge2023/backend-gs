package br.com.fiap.beRecycle.model.dto;

import br.com.fiap.beRecycle.model.entity.Coleta;

public record DadosListagemColeta(
        Long id,
        Double pesoReciclaveis,
        Long transportador,
        Long beneficiario
) {
    public DadosListagemColeta(Coleta coleta) {
        this(
                coleta.getId(),
                coleta.getPesoReciclaveis(),
                coleta.getTransportador(),
                coleta.getBeneficiario()
        );
    }
}
