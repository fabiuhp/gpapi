package br.com.fabiopereira.gpapi.services.interfaces;

import br.com.fabiopereira.gpapi.controllers.dtos.ClienteRequest;
import br.com.fabiopereira.gpapi.controllers.dtos.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse findById(Long id);
    List<ClienteResponse> findAll();
    ClienteResponse create(ClienteRequest clienteRequest);
}
