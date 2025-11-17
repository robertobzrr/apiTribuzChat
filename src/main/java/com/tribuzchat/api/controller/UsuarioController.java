package com.tribuzchat.api.controller;

import com.tribuzchat.api.model.Usuario;
import com.tribuzchat.api.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuariosService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuariosService = usuarioService;
    }

//------------------------------------------------------------------------------------------

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarUsuario(@RequestBody Usuario usuario){
        usuariosService.criarUsuario(usuario);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> buscarTodosOsUsuarios(){
        return usuariosService.buscarTodosOsUsuarios();
    }


}
