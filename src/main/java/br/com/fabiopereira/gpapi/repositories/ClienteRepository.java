package br.com.fabiopereira.gpapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fabiopereira.gpapi.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
