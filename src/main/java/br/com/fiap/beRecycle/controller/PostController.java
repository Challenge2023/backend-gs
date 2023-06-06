package br.com.fiap.beRecycle.controller;

import br.com.fiap.beRecycle.model.PostRepository;
import br.com.fiap.beRecycle.model.dto.*;
import br.com.fiap.beRecycle.model.entity.Post;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPost dados) {
        repository.save(new Post(dados));
    }

    @GetMapping
    public Page<DadosListagemPost> listarByAtivoTrue(
            @PageableDefault(size=5, sort= {"usersName"}) Pageable paginacao){
        return repository.findAllByActiveTrue(paginacao).map(DadosListagemPost:: new);
    }

    public List<Post> listarTodosPorEmail(@RequestBody @Valid DadosListarTodosPostsPorUserId dados) {
        return repository.findAllByUserId(dados.userId());
    }

    @GetMapping("/{id}")
    @Transactional
    public Optional<Post> listarUm(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPost dados) {
        Post post = new Post();
        post = repository.getReferenceById(dados.id());
        post.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        Post post = new Post();
        post = repository.getReferenceById(id);
        post.excluir();
    }
}
