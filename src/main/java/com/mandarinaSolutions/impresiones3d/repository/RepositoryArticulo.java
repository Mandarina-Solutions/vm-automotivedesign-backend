package com.mandarinaSolutions.impresiones3d.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.EntityGraph;
import com.mandarinaSolutions.impresiones3d.dominio.Articulo;


public interface RepositoryArticulo extends JpaRepository<Articulo, Integer> {
	
	//ESTO ES PARA EVITAR LAS n+1 QUERYS.
	//	@EntityGraph()
	//	Una query para la entidad, otra query para la tabla intermedia. 
	//	Asi para cada entrada de la tabla	
	@Override
	@EntityGraph(attributePaths={"colores", "categorias"})
	List<Articulo> findAll();
	
	@Override
	@EntityGraph(attributePaths={"colores", "categorias"})
	Optional<Articulo> findById(Integer id);
	
	//	SI SE HACE
	//	@ManyToMany(fetch=FetchType.EAGER) no hace falta esta query. PREGUNTAR
	//	MOCK PARA CHUSMEAS Y METER COPY PASTE
//	@Query("SELECT a FROM Articulo a JOIN FETCH a.colores JOIN FETCH a.categorias")
//	Set<Articulo> getAll();
}
