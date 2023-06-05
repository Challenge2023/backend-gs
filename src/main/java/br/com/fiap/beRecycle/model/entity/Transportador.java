package br.com.fiap.beRecycle.model.entity;

import br.com.fiap.beRecycle.model.dto.DadosAtualizacaoTransportador;
import br.com.fiap.beRecycle.model.dto.DadosCadastroTransportador;
import jakarta.persistence.*;

@Table(name = "transportador")
@Entity(name = "Transportador")
public class Transportador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;
    private String cnh;
    private String placaVeiculo;
    private Boolean ativo;

    public Transportador(){}

    public Transportador(DadosCadastroTransportador dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.endereco = dados.endereco();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.senha = dados.senha();
        this.cnh = dados.cnh();
        this.placaVeiculo = dados.placaVeiculo();
    }

    public void atualizarInformacoes(DadosAtualizacaoTransportador dados) {
        if(dados.telefone() != null) this.telefone = dados.telefone();
        if(dados.email() != null) this.email = dados.email();
        if(dados.senha() != null) this.senha = dados.senha();
    }
    public void excluir() { this.ativo = false; }

    public Long getId() {
        return id;
    }

    public Transportador setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Transportador setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Transportador setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Transportador setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Transportador setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Transportador setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getCnh() {
        return cnh;
    }

    public Transportador setCnh(String cnh) {
        this.cnh = cnh;
        return this;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public Transportador setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
        return this;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Transportador setAtivo(Boolean ativo) {
        this.ativo = ativo;
        return this;
    }
}
