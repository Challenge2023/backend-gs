package br.com.fiap.beRecycle.controller;

import br.com.fiap.beRecycle.model.DoacaoRepository;
import br.com.fiap.beRecycle.model.dto.*;
import br.com.fiap.beRecycle.model.entity.Doacao;
import br.com.fiap.beRecycle.model.entity.Doador;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doacao")
public class DoacaoController {

    @Autowired
    private DoacaoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroDoacao dados) {
        repository.save(new Doacao(dados));
    }

    @GetMapping
    public Page<DadosListagemDoacao> listar(
            @PageableDefault(size=5, sort= {"data"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemDoacao:: new);
    }

    @GetMapping("/beneficiario/{id}")
    public List<DadosListagemDoacao> listarPorBeneficiario(
            @PathVariable Long id
    ){
        return repository.findAllByBeneficiario(id);
    }

    @GetMapping("/doador/{id}")
    public List<DadosListagemDoacao> listarPorDoador(
            @PathVariable Long id
    ){
        return repository.findAllByDoador(id);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoDoacao dados) {
        Doacao doacao = new Doacao();
        doacao = repository.getReferenceById(dados.id());
        doacao.atualizarInformacoes(dados);
    }
}
