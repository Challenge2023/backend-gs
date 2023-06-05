package br.com.fiap.beRecycle.controller;

import br.com.fiap.beRecycle.model.ColetaRepository;
import br.com.fiap.beRecycle.model.dto.*;
import br.com.fiap.beRecycle.model.entity.Coleta;
import br.com.fiap.beRecycle.model.entity.Doacao;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coleta")
public class ColetaController {
    @Autowired
    private ColetaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroColeta dados) {
        repository.save(new Coleta(dados));
    }

    @GetMapping
    public Page<DadosListagemColeta> listar(
            @PageableDefault(size=5, sort= {"data"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemColeta:: new);
    }

    @GetMapping("/transportador/{id}")
    public List<DadosListagemColeta> listarPorTransportador(
            @PathVariable Long id
    ){
        return repository.findAllByTransportador(id);
    }

    @GetMapping("/beneficiario/{id}")
    public List<DadosListagemColeta> listarPorBeneficiario(
            @PathVariable Long id
    ){
        return repository.findAllByBeneficiario(id);
    }

}
