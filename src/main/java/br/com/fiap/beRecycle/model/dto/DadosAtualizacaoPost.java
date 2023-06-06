package br.com.fiap.beRecycle.model.dto;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

public record DadosAtualizacaoPost(
        @NotNull
        Long id,
        @NotNull
        @Range(min = 0, max = 1)
        Integer active
) {
}
