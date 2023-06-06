package br.com.fiap.beRecycle.model.entity;

import br.com.fiap.beRecycle.model.dto.DadosAtualizacaoPost;
import br.com.fiap.beRecycle.model.dto.DadosCadastroPost;
import jakarta.persistence.*;

@Table(name = "tb_post")
@Entity(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String local;
    private String description;
    private Integer active;

    public Post(){}

    public Post(DadosCadastroPost dados) {
        this.active = 1;
        this.name = dados.name();
        this.phone = dados.phone();
        this.email = dados.email();
        this.local = dados.local();
        this.description = dados.description();
    }

    public void atualizarInformacoes(DadosAtualizacaoPost dados) {
        if(dados.active() != null) this.active = dados.active();
    }

    public void excluir() { this.active = 0; }

    public Long getId() {
        return id;
    }

    public Post setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Post setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Post setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Post setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getLocal() {
        return local;
    }

    public Post setLocal(String local) {
        this.local = local;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Post setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getActive() {
        return active;
    }

    public Post setActive(Integer active) {
        this.active = active;
        return this;
    }
}
