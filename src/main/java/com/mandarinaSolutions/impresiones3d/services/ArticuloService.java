package com.mandarinaSolutions.impresiones3d.services;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mandarinaSolutions.impresiones3d.dominio.Articulo;
import com.mandarinaSolutions.impresiones3d.repository.RepositoryArticulo;


@Service
public class ArticuloService {
	
	@Autowired
	private RepositoryArticulo repo;
	
	public Set<Articulo> getAll() {
		HashSet<Articulo> resultadoToSet = new HashSet<Articulo>(repo.findAll());
		return resultadoToSet;
	}
	
	public Articulo articuloByID(Integer id) {
		Articulo articulo = repo.findById(id).get();
		return articulo;
	}
	
	public void addArticulo(Articulo articulo) {
		repo.save(articulo);
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}
	
	public void updateArticulo(Articulo articulo) {
		repo.save(articulo);
	}
	
	public Set<Articulo> mock() {
		HashSet<Articulo> resultadoToSet = new HashSet<Articulo>(repo.findAll());
		return resultadoToSet;
	}
	
}
