package br.com.fiap.beRecycle.model.entity;

import br.com.fiap.beRecycle.model.dto.DadosAtualizacaoDoador;
import br.com.fiap.beRecycle.model.dto.DadosCadastroDoador;
import jakarta.persistence.*;

@Table(name = "doador")
@Entity(name = "Doador")
public class Doador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;
    private String cnpj;
    private Boolean ativo;

    public Doador() {
    }

    public Doador(DadosCadastroDoador dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.endereco = dados.endereco();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.senha = dados.senha();
        this.cnpj = dados.cnpj();
    }

    public void atualizarInformacoes(DadosAtualizacaoDoador dados) {
        if (dados.nome() != null) this.nome = dados.nome();
        if(dados.telefone() != null) this.telefone = dados.telefone();
        if(dados.email() != null) this.email = dados.email();
        if(dados.senha() != null) this.senha = dados.senha();
    }

    public void excluir() { this.ativo = false; }

    public Long getId() {
        return id;
    }

    public Doador setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Doador setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Doador setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Doador setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Doador setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Doador setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Doador setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Doador setAtivo(Boolean ativo) {
        this.ativo = ativo;
        return this;
    }
}
