package br.com.fabiopereira.gpapi.controllers.exceptions;

public class RecursoNaoEncontradoException extends RuntimeException{
    public RecursoNaoEncontradoException(String message) {
        super(message);
    }
}
