package br.com.fiap.beRecycle.controller;

import br.com.fiap.beRecycle.model.TransportadorRepository;
import br.com.fiap.beRecycle.model.dto.*;
import br.com.fiap.beRecycle.model.entity.Doador;
import br.com.fiap.beRecycle.model.entity.Transportador;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transportador")
public class TransportadorController {

    @Autowired
    private TransportadorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroTransportador dados) {
        repository.save(new Transportador(dados));
    }

    @GetMapping
    public Page<DadosListagemTransportador> listar(
            @PageableDefault(size=5, sort= {"nome"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemTransportador:: new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoTransportador dados) {
        Transportador transportador = new Transportador();
        transportador = repository.getReferenceById(dados.id());
        transportador.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        Transportador transportador = new Transportador();
        transportador = repository.getReferenceById(id);
        transportador.excluir();
    }
}
