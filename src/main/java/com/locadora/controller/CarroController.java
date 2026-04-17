package com.locadora.controller;

import com.locadora.model.Carro;
import com.locadora.repository.CarroRepository;
import io.micronaut.http.annotation.*;
import io.micronaut.http.MediaType;
import io.micronaut.http.HttpResponse;
import io.micronaut.views.View;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Controller("/carros") // Se essa linha estiver errada, dá 404
public class CarroController {

    private final CarroRepository carroRepository;

    public CarroController(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    @Get("/novo")
    @View("carro-form") // Verifique se o arquivo carro-form.html existe em views
    public Map<String, Object> novo() {
        return new HashMap<>();
    }

    @Post(value = "/salvar", consumes = MediaType.APPLICATION_FORM_URLENCODED)
    public HttpResponse<?> salvar(@Body Carro carro) {
        carroRepository.save(carro);
        return HttpResponse.seeOther(URI.create("/"));
    }
}