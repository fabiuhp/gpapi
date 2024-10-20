package br.com.fabiopereira.gpapi.services.implementations;

import java.util.List;
import java.util.Optional;

import br.com.fabiopereira.gpapi.controllers.dtos.ClienteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fabiopereira.gpapi.controllers.dtos.ClienteResponse;
import br.com.fabiopereira.gpapi.controllers.exceptions.RecursoNaoEncontradoException;
import br.com.fabiopereira.gpapi.models.Cliente;
import br.com.fabiopereira.gpapi.repositories.ClienteRepository;
import br.com.fabiopereira.gpapi.services.interfaces.ClienteService;

@Component
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public ClienteResponse findById(Long id) {
        Cliente cliente = clienteRepository.findById(id)
            .orElseThrow(() -> new RecursoNaoEncontradoException("Cliente não encontrado com ID: " + id));

        return cliente.toClienteResponse();
    }

    @Override
    public List<ClienteResponse> findAll() {
        return clienteRepository.findAll()
                .stream()
                .map(Cliente::toClienteResponse)
                .toList();
    }

    @Override
    public ClienteResponse create(ClienteRequest clienteRequest) {
        return clienteRepository
                .save(Cliente.fromClienteRequest(clienteRequest))
                .toClienteResponse();
    }
}
