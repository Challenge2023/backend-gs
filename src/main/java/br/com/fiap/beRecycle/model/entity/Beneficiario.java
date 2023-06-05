package br.com.fiap.beRecycle.model.entity;

import br.com.fiap.beRecycle.model.dto.DadosAtualizacaoBeneficiario;
import br.com.fiap.beRecycle.model.dto.DadosCadastroBeneficiario;
import jakarta.persistence.*;

@Table(name = "benefiario")
@Entity(name = "Beneficiario")
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;
    private Boolean ativo;

    public Beneficiario() {}

    public Beneficiario(DadosCadastroBeneficiario dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.endereco = dados.endereco();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.senha = dados.senha();
    }

    public void atualizarInformacoes(DadosAtualizacaoBeneficiario dados) {
        if (dados.nome() != null) this.nome = dados.nome();
        if (dados.telefone() != null) this.telefone = dados.telefone();
        if (dados.email() != null) this.email = dados.email();
        if (dados.senha() != null) this.senha = dados.senha();
    }

    public void excluir() { this.ativo = false; }

    public Long getId() {
        return id;
    }

    public Beneficiario setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Beneficiario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Beneficiario setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Beneficiario setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Beneficiario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Beneficiario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Beneficiario setAtivo(Boolean ativo) {
        this.ativo = ativo;
        return this;
    }
}
