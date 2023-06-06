package br.com.fiap.beRecycle.model;

import br.com.fiap.beRecycle.model.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Page<Post> findAllByActiveTrue(Pageable paginacao);
    List<Post> findAllByEmail(String usersEmail);
}
