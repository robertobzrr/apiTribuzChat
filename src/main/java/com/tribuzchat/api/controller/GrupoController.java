package com.tribuzchat.api.controller;

import com.tribuzchat.api.model.Grupo;
import com.tribuzchat.api.service.GrupoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {

    private final GrupoService grupoService;

    public GrupoController(GrupoService grupoService){
        this.grupoService = grupoService;
    }

//------------------------------------------------------------------------------------------

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarGrupo(@RequestBody Grupo grupo){
        grupoService.criarGrupo(grupo);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Grupo> buscarTodosOsGrupos(){
        return grupoService.buscarTodosOsGrupos();
    }


}
