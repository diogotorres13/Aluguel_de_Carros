package com.locadora.controller;

import com.locadora.model.Carro;
import com.locadora.repository.CarroRepository;
import io.micronaut.http.annotation.*;
import io.micronaut.http.MediaType;
import io.micronaut.views.View;
import io.micronaut.http.HttpResponse;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Controller("/carros")
public class CarroController {

    private final CarroRepository carroRepository;

    public CarroController(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    @Get("/novo")
    @View("carro-form")
    public Map<String, Object> novo() {
        return new HashMap<>();
    }

    @Post(value = "/salvar", consumes = MediaType.APPLICATION_FORM_URLENCODED)
    public HttpResponse<?> salvar(@Body Carro carro) {
        carroRepository.save(carro);
        return HttpResponse.seeOther(URI.create("/"));
    }
}