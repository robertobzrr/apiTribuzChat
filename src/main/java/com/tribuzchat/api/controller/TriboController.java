package com.tribuzchat.api.controller;

import com.tribuzchat.api.model.Tribo;
import com.tribuzchat.api.service.TriboService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tribos")
public class TriboController {

    private final TriboService triboService;

    public TriboController(TriboService triboService){
        this.triboService = triboService;
    }

//------------------------------------------------------------------------------------------

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarTribo(@RequestBody Tribo tribo){
        triboService.criarTribo(tribo);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Tribo> buscarTodasAsTribos(){
        return triboService.buscarTodasAsTribos();
    }


}
