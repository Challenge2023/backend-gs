package br.com.fiap.beRecycle.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record DadosCadastroPost(
        @NotBlank
        String name,
        @NotBlank
        @Length(min = 11)
        String phone,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String local,
        @NotBlank
        String description
) {
}
