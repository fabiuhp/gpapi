package br.com.fabiopereira.gpapi.controllers;

import br.com.fabiopereira.gpapi.controllers.dtos.ClienteRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.fabiopereira.gpapi.controllers.dtos.ClienteResponse;
import br.com.fabiopereira.gpapi.services.interfaces.ClienteService;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;
    
    @GetMapping("{id}")
    public ResponseEntity<ClienteResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<ClienteResponse>> findAll() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @PostMapping
    public ResponseEntity<ClienteResponse> create(@Valid @RequestBody ClienteRequest clienteRequest){
        return ResponseEntity.ok(clienteService.create(clienteRequest));
    }
}
