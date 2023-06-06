package br.com.fiap.beRecycle.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record DadosAtualizacaoUser(
        @NotNull
        Long id,
        @NotBlank
        String name,
        @NotBlank
        @Length(min = 10)
        String cep,
        @NotBlank
        @Length(min = 11)
        String phone,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Length(min = 6)
        String pass
) {
}
