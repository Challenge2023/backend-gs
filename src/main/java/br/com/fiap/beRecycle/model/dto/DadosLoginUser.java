package br.com.fiap.beRecycle.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record DadosLoginUser(
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Length(min = 6)
        String pass
) {
}
