package com.mandarinaSolutions.impresiones3d.DTO;

import com.mandarinaSolutions.impresiones3d.dominio.Usuario;

public class UserDTO {

    public Integer Id;
    public String username;
    public String password;
    public UserDTO(String username, String password, Integer Id) {
        this.Id = Id;
        this.username = username;
        this.password = password;
    }

}

