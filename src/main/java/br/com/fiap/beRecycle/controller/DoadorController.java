package br.com.fiap.beRecycle.controller;

import br.com.fiap.beRecycle.model.DoadorRepository;
import br.com.fiap.beRecycle.model.dto.DadosAtualizacaoDoador;
import br.com.fiap.beRecycle.model.dto.DadosCadastroDoador;
import br.com.fiap.beRecycle.model.dto.DadosListagemDoador;
import br.com.fiap.beRecycle.model.entity.Doador;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doador")
public class DoadorController {
	
	@Autowired
	private DoadorRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroDoador dados) {
		repository.save(new Doador(dados));
	}
	
	@GetMapping
	public Page<DadosListagemDoador> listar(
			@PageableDefault(size=3, sort= {"nome"}) Pageable paginacao){
		return repository.findAllByAtivoTrue(paginacao).map(DadosListagemDoador:: new);
	}
	
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoDoador dados) {
		Doador doador = new Doador();
		doador = repository.getReferenceById(dados.id());
		doador.atualizarInformacoes(dados);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		Doador doador = new Doador();
		doador = repository.getReferenceById(id);
		doador.excluir();
	}

}