package br.com.fiap.beRecycle.model.dto;

import br.com.fiap.beRecycle.model.entity.Type;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record DadosCadastroPost(
        @NotBlank
        String name,
        @NotNull
        Long userId,
        @NotBlank
        @Length(min = 11)
        String phone,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String local,
        @NotBlank
        String description,
        @Enumerated(EnumType.STRING)
        Type type
) {
}
