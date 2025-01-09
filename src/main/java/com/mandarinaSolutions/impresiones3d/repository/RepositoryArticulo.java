package com.mandarinaSolutions.impresiones3d.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mandarinaSolutions.impresiones3d.dominio.Articulo;

public interface RepositoryArticulo extends JpaRepository<Articulo, Integer> {

}
