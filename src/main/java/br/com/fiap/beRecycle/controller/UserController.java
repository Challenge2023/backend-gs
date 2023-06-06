package br.com.fiap.beRecycle.controller;

import br.com.fiap.beRecycle.model.UserRepository;
import br.com.fiap.beRecycle.model.dto.DadosAtualizacaoUser;
import br.com.fiap.beRecycle.model.dto.DadosCadastroUser;
import br.com.fiap.beRecycle.model.dto.DadosListagemUser;
import br.com.fiap.beRecycle.model.entity.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doador")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroUser dados) {
        repository.save(new User(dados));
    }

    @GetMapping
    public Page<DadosListagemUser> listar(
            @PageableDefault(size=3, sort= {"nome"}) Pageable paginacao){
        return repository.findAllByActiveTrue(paginacao).map(DadosListagemUser:: new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoUser dados) {
        User user = new User();
        user = repository.getReferenceById(dados.id());
        user.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        User user = new User();
        user = repository.getReferenceById(id);
        user.excluir();
    }
}
