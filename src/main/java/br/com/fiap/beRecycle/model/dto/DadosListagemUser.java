package br.com.fiap.beRecycle.model.dto;

import br.com.fiap.beRecycle.model.entity.Type;
import br.com.fiap.beRecycle.model.entity.User;

public record DadosListagemUser(
        Long id,
        String name,
        String phone,
        String email,
        String cep,
        Type type
) {
    public DadosListagemUser(User user) {
        this(
                user.getId(),
                user.getName(),
                user.getPhone(),
                user.getEmail(),
                user.getCep(),
                user.getType()
        );
    }
}
