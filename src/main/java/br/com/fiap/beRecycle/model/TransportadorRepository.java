package br.com.fiap.beRecycle.model;

import br.com.fiap.beRecycle.model.entity.Beneficiario;
import br.com.fiap.beRecycle.model.entity.Transportador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportadorRepository extends JpaRepository<Transportador, Long> {
    Page<Transportador> findAllByAtivoTrue(Pageable paginacao);
}
