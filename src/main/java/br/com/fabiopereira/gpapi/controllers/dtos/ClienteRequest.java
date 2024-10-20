package br.com.fabiopereira.gpapi.controllers.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ClienteRequest(
        @NotBlank(message = "O nome não pode estar vazio")
        String nome,

        @NotBlank(message = "O telefone não pode estar vazio")
        @Size(min = 10, max = 15, message = "O telefone deve ter entre 10 e 15 caracteres")
        String telefone,

        String endereco
) {
}
