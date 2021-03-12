package com.metrosCuadrados;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerMetrosCuadrados {
    @PostMapping(path = "/metrosC")
    public MetrosCuadrados getCalculo(@RequestBody CasaDTO casaDTO){

        MetrosCuadrados met = new MetrosCuadrados(casaDTO);
        return met;
    }
}
