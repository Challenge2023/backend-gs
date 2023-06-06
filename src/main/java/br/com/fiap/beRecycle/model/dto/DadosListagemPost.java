package br.com.fiap.beRecycle.model.dto;

import br.com.fiap.beRecycle.model.entity.Post;

public record DadosListagemPost(
        Long id,
        String name,
        String phone,
        String email,
        String description
) {
    public DadosListagemPost(Post post) {
        this(
                post.getId(),
                post.getName(),
                post.getPhone(),
                post.getEmail(),
                post.getDescription()
        );
    }
}
