package br.com.fabiopereira.gpapi.controllers.dtos;

public record ClienteResponse(
    String nome,
    String telefone,
    String endereco
) {}
