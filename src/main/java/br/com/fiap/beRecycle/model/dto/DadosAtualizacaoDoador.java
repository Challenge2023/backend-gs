package br.com.fiap.beRecycle.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record DadosAtualizacaoDoador(
        @NotNull
        Long id,

        String nome,

        @Length(min = 11)
        String telefone,

        @Email
        String email,
        @Length(min = 6)
        String senha
) {
}
