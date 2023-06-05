package br.com.fiap.beRecycle.model.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroColeta(
        @DecimalMin(value = "0.1")
        Double pesoReciclaveis,
        @NotNull
        Long transportador,
        @NotNull
        Long beneficiario
){
}
