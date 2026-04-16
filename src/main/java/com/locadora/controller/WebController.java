package com.locadora.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;
import java.util.Collections;
import java.util.Map;

@Controller("/")
public class WebController {

    @Get("/")
    @View("index")
    public Map<String, Object> index() {
        return Collections.emptyMap();
    }
}