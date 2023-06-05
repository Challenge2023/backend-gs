package br.com.fiap.beRecycle.model;

import br.com.fiap.beRecycle.model.dto.DadosListagemColeta;
import br.com.fiap.beRecycle.model.entity.Coleta;
import br.com.fiap.beRecycle.model.entity.Doacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColetaRepository extends JpaRepository<Coleta, Long> {
    List<DadosListagemColeta> findAllByBeneficiario(Long id);
    List<DadosListagemColeta> findAllByTransportador(Long id);
}
