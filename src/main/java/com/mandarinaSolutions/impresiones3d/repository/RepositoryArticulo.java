package com.mandarinaSolutions.impresiones3d.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mandarinaSolutions.impresiones3d.dominio.Articulo;

public interface RepositoryArticulo extends JpaRepository<Articulo, Integer> {
	
	//	
	@Query("SELECT a FROM Articulo a where a.id = 1")
	Articulo articulosBasic();
	
	@Query("SELECT a.titulo FROM Articulo a where a.id = 1")
	String titulo();
}
