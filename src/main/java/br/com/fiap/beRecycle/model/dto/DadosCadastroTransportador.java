package br.com.fiap.beRecycle.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record DadosCadastroTransportador(
        @NotBlank
        String nome,
        @NotBlank
        String endereco,
        @NotBlank
        @Length(min = 11)
        String telefone,
        @NotBlank
        @Email()
        String email,
        @NotBlank
        @Length(min = 6)
        String senha,
        @NotBlank
        @Length(min = 10)
        String cnh,
        @NotBlank
        String placaVeiculo
) {
}
