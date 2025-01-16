package com.mandarinaSolutions.impresiones3d.controller;

import com.mandarinaSolutions.impresiones3d.DTO.UserDTO;
import com.mandarinaSolutions.impresiones3d.dominio.Articulo;
import com.mandarinaSolutions.impresiones3d.dominio.Categoria;
import com.mandarinaSolutions.impresiones3d.services.CategoriaService;
import com.mandarinaSolutions.impresiones3d.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ControllerUsuario {

    @Autowired
    private UsuarioService userService;

    @PutMapping("login")
    public boolean logeo(@RequestBody UserDTO userDTO) {
        return userService.logeo(userDTO);
    }


}
