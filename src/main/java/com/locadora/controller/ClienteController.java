package com.locadora.controller;

import com.locadora.model.Cliente;
import com.locadora.repository.ClienteRepository;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import io.micronaut.http.HttpResponse;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Controller("/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Get("/novo")
    @View("cliente-form")
    public Map<String, Object> novo() {
        return new HashMap<>();
    }

    @Post("/salvar")
    public HttpResponse<?> salvar(@Body Cliente cliente) {
        clienteRepository.save(cliente);
        return HttpResponse.seeOther(URI.create("/"));
    }
}