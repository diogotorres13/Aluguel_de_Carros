package com.locadora.controller;

import com.locadora.model.Cliente;
import com.locadora.repository.ClienteRepository;
import io.micronaut.http.annotation.*;
import io.micronaut.http.MediaType;
import io.micronaut.http.HttpResponse;
import io.micronaut.views.View;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Controller("/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Exibe o formulário de cadastro (Requisito: Cadastro Prévio)
    @Get("/novo")
    @View("cliente-form")
    public Map<String, Object> novo() {
        return new HashMap<>();
    }

    // Processa o cadastro (Requisito: Dados de identificação e até 3 rendimentos)
    @Post(value = "/salvar", consumes = MediaType.APPLICATION_FORM_URLENCODED)
    public HttpResponse<?> salvar(@Body Cliente cliente) {
        // O @Body é o que faz a mágica de transformar o formulário no objeto Cliente
        clienteRepository.save(cliente);
        
        // Após salvar, redireciona para a home (index)
        return HttpResponse.seeOther(URI.create("/"));
    }
}