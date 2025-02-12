package com.mandarinaSolutions.impresiones3d.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mandarinaSolutions.impresiones3d.dominio.Categoria;



public interface RepositoryCategoria extends JpaRepository<Categoria, Integer> {
		
}
