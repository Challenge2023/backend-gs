package br.com.fiap.beRecycle.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosListarTodosPostsPorEmail(
        @NotBlank
        @Email
        String email
) {
}
