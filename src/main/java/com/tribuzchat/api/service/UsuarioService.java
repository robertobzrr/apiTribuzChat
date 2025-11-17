package com.tribuzchat.api.service;

import com.tribuzchat.api.model.Usuario;
import com.tribuzchat.api.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

//------------------------------------------------------------------------------------------

    public void criarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }


    public List<Usuario> buscarTodosOsUsuarios(){
        return usuarioRepository.findAll();
    }


}
