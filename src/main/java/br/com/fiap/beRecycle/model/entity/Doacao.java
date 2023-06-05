package br.com.fiap.beRecycle.model.entity;

import br.com.fiap.beRecycle.model.dto.DadosAtualizacaoDoacao;
import br.com.fiap.beRecycle.model.dto.DadosCadastroDoacao;
import jakarta.persistence.*;


import java.time.LocalDateTime;

@Table(name = "doacao")
@Entity(name = "Doacao")
public class Doacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime data;
    private Status status;
    private Long doador;
    private Long beneficiario;

    public Doacao(){}

    public Doacao(DadosCadastroDoacao dados) {
        this.data = dados.data();
        this.status = dados.status();
        this.doador = dados.doador();
        this.beneficiario = dados.beneficiario();
    }

    public void atualizarInformacoes(DadosAtualizacaoDoacao dados) {
        if (dados.data() != null) this.data = dados.data();
        if (dados.status() != null ) this.status = dados.status();
    }

    public Long getId() {
        return id;
    }

    public Doacao setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Doacao setData(LocalDateTime data) {
        this.data = data;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Doacao setStatus(Status status) {
        this.status = status;
        return this;
    }

    public Long getDoador() {
        return doador;
    }

    public Doacao setDoador(Long doador) {
        this.doador = doador;
        return this;
    }

    public Long getBeneficiario() {
        return beneficiario;
    }

    public Doacao setBeneficiario(Long beneficiario) {
        this.beneficiario = beneficiario;
        return this;
    }
}
