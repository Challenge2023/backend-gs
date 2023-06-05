package br.com.fiap.beRecycle.model.entity;

import br.com.fiap.beRecycle.model.dto.DadosCadastroColeta;
import jakarta.persistence.*;

@Table(name = "coleta")
@Entity(name = "Coleta")
public class Coleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double pesoReciclaveis;
    private Long transportador;
    private Long beneficiario;

    public Coleta() {}

    public Coleta(DadosCadastroColeta dados) {
        this.pesoReciclaveis = dados.pesoReciclaveis();
        this.transportador = dados.transportador();
        this.beneficiario = dados.beneficiario();
    }

    public Long getId() {
        return id;
    }

    public Coleta setId(Long id) {
        this.id = id;
        return this;
    }

    public Double getPesoReciclaveis() {
        return pesoReciclaveis;
    }

    public Coleta setPesoReciclaveis(Double pesoReciclaveis) {
        this.pesoReciclaveis = pesoReciclaveis;
        return this;
    }

    public Long getTransportador() {
        return transportador;
    }

    public Coleta setTransportador(Long transportador) {
        this.transportador = transportador;
        return this;
    }

    public Long getBeneficiario() {
        return beneficiario;
    }

    public Coleta setBeneficiario(Long beneficiario) {
        this.beneficiario = beneficiario;
        return this;
    }
}
