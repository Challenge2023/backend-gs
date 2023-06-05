package br.com.fiap.beRecycle.controller;

import br.com.fiap.beRecycle.model.BeneficiarioRepository;
import br.com.fiap.beRecycle.model.dto.*;
import br.com.fiap.beRecycle.model.entity.Beneficiario;
import br.com.fiap.beRecycle.model.entity.Doador;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/beneficiario")
public class BeneficiarioController {

    @Autowired
    private BeneficiarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroBeneficiario dados) {
        repository.save(new Beneficiario(dados));
    }

    @GetMapping
    public Page<DadosListagemBeneficiario> listar(
            @PageableDefault(size=5, sort= {"nome"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemBeneficiario:: new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoBeneficiario dados) {
        Beneficiario beneficiario = new Beneficiario();
        beneficiario = repository.getReferenceById(dados.id());
        beneficiario.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        Beneficiario beneficiario = new Beneficiario();
        beneficiario = repository.getReferenceById(id);
        beneficiario.excluir();
    }
}
