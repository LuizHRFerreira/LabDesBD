package br.gov.sp.fatec.springboot3app2025.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springboot3app2025.entity.Usuario;
import br.gov.sp.fatec.springboot3app2025.service.UsuarioService;

@RestController@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;


    @GetMapping
    public List<Usuario> buscarTodos(){{
        return service.buscarTodos();
    }}

    @GetMapping(value = "/{idUsuario}")
    public Usuario novoUsuario(@RequestBody Usuario usuario){
        return service.novo(usuario);
    }
}
