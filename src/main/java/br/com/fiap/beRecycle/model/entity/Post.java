package br.com.fiap.beRecycle.model.entity;

import br.com.fiap.beRecycle.model.dto.DadosAtualizacaoPost;
import br.com.fiap.beRecycle.model.dto.DadosCadastroPost;
import jakarta.persistence.*;

@Entity
@Table(
        name = "tb_post",
        uniqueConstraints = {
            @UniqueConstraint(name = "fk_user_post", columnNames = "id_user"),
        }
)

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_post")
    @SequenceGenerator(
            name = "sq_post",
            sequenceName = "sq_post",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "id_post")
    private Long id;
    @Column(name = "id_user")
    private Long userId;
    @Column(name = "nm_post")
    private String name;
    @Column(name = "num_phone")
    private String phone;
    @Column(name = "ds_email")
    private String email;
    @Column(name = "ds_local")
    private String local;
    @Column(name = "ds_post")
    private String description;
    @Column(name = "ds_active")
    private Integer active;
    @Column(name = "tp_post")
    private Type type;

    public Post(){}

    public Post(DadosCadastroPost dados) {
        this.active = 1;
        this.name = dados.name();
        this.phone = dados.phone();
        this.email = dados.email();
        this.local = dados.local();
        this.userId = dados.userId();
        this.type = dados.type();
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

    public Type getType() {
        return type;
    }

    public Post setType(Type type) {
        this.type = type;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public Post setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
