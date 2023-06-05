package br.com.fiap.beRecycle.model;


import br.com.fiap.beRecycle.model.dto.DadosListagemDoacao;
import br.com.fiap.beRecycle.model.entity.Doacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoacaoRepository extends JpaRepository<Doacao, Long> {
    List<DadosListagemDoacao> findAllByBeneficiario(Long id);
    List<DadosListagemDoacao> findAllByDoador(Long id);
}
