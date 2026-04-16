package com.locadora.controller;

import com.locadora.model.Pedido;
import com.locadora.repository.CarroRepository;
import com.locadora.repository.ClienteRepository;
import com.locadora.repository.PedidoRepository;
import io.micronaut.http.annotation.*;
import io.micronaut.http.MediaType;
import io.micronaut.views.View;
import io.micronaut.http.HttpResponse;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Controller("/pedidos")
public class PedidoController {

    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private final CarroRepository carroRepository;

    public PedidoController(PedidoRepository pedidoRepository, 
                            ClienteRepository clienteRepository, 
                            CarroRepository carroRepository) {
        this.pedidoRepository = pedidoRepository;
        this.clienteRepository = clienteRepository;
        this.carroRepository = carroRepository;
    }

    @Get("/novo")
    @View("pedido-form")
    public Map<String, Object> novo() {
        Map<String, Object> model = new HashMap<>();
        model.put("clientes", clienteRepository.findAll());
        model.put("carros", carroRepository.findAll());
        return model;
    }

    @Post(value = "/salvar", consumes = MediaType.APPLICATION_FORM_URLENCODED)
    public HttpResponse<?> salvar(@Body Pedido pedido) {
        pedidoRepository.save(pedido);
        return HttpResponse.seeOther(URI.create("/"));
    }
}