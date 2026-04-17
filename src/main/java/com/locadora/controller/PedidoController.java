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
import java.util.Collections;
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

    // Tela de formulário para criar novo aluguel
    @Get("/novo")
    @View("pedido-form")
    public Map<String, Object> novo() {
        Map<String, Object> model = new HashMap<>();
        model.put("clientes", clienteRepository.findAll());
        model.put("carros", carroRepository.findAll());
        return model;
    }

    // Listagem de pedidos para consulta e avaliação (Requisito Sprint 03)
    @Get("/listar")
    @View("pedidos-lista")
    public Map<String, Object> listar() {
        return Collections.singletonMap("pedidos", pedidoRepository.findAll());
    }

    // Salva o pedido inicial com status "PENDENTE"
    @Post(value = "/salvar", consumes = MediaType.APPLICATION_FORM_URLENCODED)
    public HttpResponse<?> salvar(@Body Pedido pedido) {
        pedidoRepository.save(pedido);
        return HttpResponse.seeOther(URI.create("/pedidos/listar"));
    }

    // Lógica para o Agente aprovar/avaliar o pedido (Requisito: Agentes avaliam pedidos)
    @Post(value = "/avaliar/{id}", consumes = MediaType.APPLICATION_FORM_URLENCODED)
    public HttpResponse<?> avaliar(@PathVariable Long id, String novoStatus) {
        pedidoRepository.findById(id).ifPresent(p -> {
            p.setStatus(novoStatus); // Atualiza para APROVADO ou CANCELADO
            pedidoRepository.update(p);
        });
        return HttpResponse.seeOther(URI.create("/pedidos/listar"));
    }
}