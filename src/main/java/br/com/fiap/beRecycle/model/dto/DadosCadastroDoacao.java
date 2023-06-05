package br.com.fiap.beRecycle.model.dto;

import br.com.fiap.beRecycle.model.entity.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDateTime;

public record DadosCadastroDoacao(
        @PastOrPresent
        LocalDateTime data,
        @Enumerated(EnumType.STRING)
        Status status,
        @NotNull
        Long doador,
        @NotNull
        Long beneficiario
) {
}
