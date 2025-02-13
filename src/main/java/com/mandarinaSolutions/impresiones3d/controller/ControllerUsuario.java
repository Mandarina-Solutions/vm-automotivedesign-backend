package com.mandarinaSolutions.impresiones3d.controller;

import com.mandarinaSolutions.impresiones3d.DTO.UserDTO;
import com.mandarinaSolutions.impresiones3d.dominio.Articulo;
import com.mandarinaSolutions.impresiones3d.dominio.Categoria;
import com.mandarinaSolutions.impresiones3d.services.CategoriaService;
import com.mandarinaSolutions.impresiones3d.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class ControllerUsuario {

    @Autowired
    private UsuarioService userService;

    @PutMapping("login")
    public boolean logeo(@RequestBody UserDTO userDTO) {
        return userService.logeo(userDTO);
    }

    @GetMapping("logout")
    public boolean logout() {
        return userService.logout();
    }
}
