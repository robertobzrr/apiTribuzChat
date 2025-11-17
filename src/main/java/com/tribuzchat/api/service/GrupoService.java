package com.tribuzchat.api.service;

import com.tribuzchat.api.model.Grupo;
import com.tribuzchat.api.repository.GrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoService {

    private final GrupoRepository grupoRepository;

    public GrupoService(GrupoRepository grupoRepository){
        this.grupoRepository = grupoRepository;
    }

//------------------------------------------------------------------------------------------

    public void criarGrupo(Grupo grupo){
        grupoRepository.save(grupo);
    }


    public List<Grupo> buscarTodosOsGrupos(){
        return grupoRepository.findAll();
    }



}
