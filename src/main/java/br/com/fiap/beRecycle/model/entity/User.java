package br.com.fiap.beRecycle.model.entity;

import br.com.fiap.beRecycle.model.dto.DadosAtualizacaoUser;
import br.com.fiap.beRecycle.model.dto.DadosCadastroUser;
import jakarta.persistence.*;

@Table(name = "tb_user")
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cep;
    private String phone;
    private String email;
    private String pass;
    private Integer active;
    private Type type;
    @Column(name = "housenumber")
    private String houseNumber = null;
    private String cnh = null;
    private String vehicle = null;
    private String cnpj = null;

    public User() {
    }
    public User(DadosCadastroUser dados) {
        this.active = 1;
        this.name = dados.name();
        this.cep = dados.cep();
        this.phone = dados.phone();
        this.email = dados.email();
        this.pass = dados.pass();
        this.type = dados.type();
        this.houseNumber = dados.houseNumber();
        this.cnh = dados.cnh();
        this.vehicle = dados.vehicle();
        this.cnpj = dados.cnpj();
    }

    public void atualizarInformacoes(DadosAtualizacaoUser dados) {
        if(dados.name() != null) this.name = dados.name();
        if(dados.cep() != null) this.cep = dados.cep();
        if(dados.phone() != null) this.phone = dados.phone();
        if(dados.email() != null) this.email = dados.email();
        if(dados.pass() != null) this.pass = dados.pass();
    }
    public void excluir() { this.active = 0; }

    public String getHouseNumber() {
        return houseNumber;
    }

    public User setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public User setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public User setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public Integer getActive() {
        return active;
    }

    public User setActive(Integer active) {
        this.active = active;
        return this;
    }

    public Type getType() {
        return type;
    }

    public User setType(Type type) {
        this.type = type;
        return this;
    }

    public String getCnh() {
        return cnh;
    }

    public User setCnh(String cnh) {
        this.cnh = cnh;
        return this;
    }

    public String getVehicle() {
        return vehicle;
    }

    public User setVehicle(String vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public User setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
}
