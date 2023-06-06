package br.com.fiap.beRecycle.model.dto;

import br.com.fiap.beRecycle.model.entity.Post;
import br.com.fiap.beRecycle.model.entity.Type;

public record DadosListagemPost(
        Long id,
        Long userId,
        String name,
        String phone,
        String email,
        String description,
        Type type
) {
    public DadosListagemPost(Post post) {
        this(
                post.getId(),
                post.getUserId(),
                post.getName(),
                post.getPhone(),
                post.getEmail(),
                post.getDescription(),
                post.getType()
        );
    }
}
