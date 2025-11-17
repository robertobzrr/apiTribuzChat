package com.tribuzchat.api.service;

import com.tribuzchat.api.model.Tribo;
import com.tribuzchat.api.repository.TriboRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TriboService {

    private final TriboRepository triboRepository;

    public TriboService(TriboRepository triboRepository){
        this.triboRepository = triboRepository;
    }

//------------------------------------------------------------------------------------------

    public void criarTribo(Tribo tribo){
        triboRepository.save(tribo);
    }


    public List<Tribo> buscarTodasAsTribos(){
        return triboRepository.findAll();
    }


}