package br.com.fiap.beRecycle.model.dto;

import br.com.fiap.beRecycle.model.entity.Type;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record DadosCadastroUser(
        @NotBlank
        String name,
        @NotBlank
        @Length(min = 9)
        String cep,
        @NotBlank
        @Length(min = 11)
        String phone,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Length(min = 6)
        String pass,
        @Enumerated(EnumType.STRING)
        Type type,
        String houseNumber,
        String cnh,
        String vehicle,
        @Length(min = 14)
        String cnpj
) {

}
