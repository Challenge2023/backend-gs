package br.com.fiap.beRecycle.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record DadosAtualizacaoTransportador(
        @NotNull
        Long id,
        @NotBlank
        @Length(min = 11)
        String telefone,
        @NotBlank
        @Email()
        String email,
        @NotBlank
        @Length(min = 6)
        String senha
) {
}
