package br.com.fiap.beRecycle.model;

import br.com.fiap.beRecycle.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Page<User> findAllByAtivoTrue(Pageable paginacao);
}
