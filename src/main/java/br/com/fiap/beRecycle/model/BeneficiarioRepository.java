package br.com.fiap.beRecycle.model;

import br.com.fiap.beRecycle.model.entity.Beneficiario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
    Page<Beneficiario> findAllByAtivoTrue(Pageable paginacao);
}
