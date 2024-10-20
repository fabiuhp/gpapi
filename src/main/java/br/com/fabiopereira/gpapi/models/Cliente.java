package br.com.fabiopereira.gpapi.models;

import br.com.fabiopereira.gpapi.controllers.dtos.ClienteRequest;
import br.com.fabiopereira.gpapi.controllers.dtos.ClienteResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255, nullable = false)
    private String nome;

    @Column(length = 15)
    private String telefone;

    @Column(length = 255)
    private String endereco;

    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public ClienteResponse toClienteResponse() {
        return new ClienteResponse(this.nome, this.telefone, this.endereco);
    }

    public static Cliente fromClienteRequest(ClienteRequest clienteRequest) {
        return new Cliente(
                clienteRequest.nome(),
                clienteRequest.telefone(),
                clienteRequest.endereco()
        );
    }
}
