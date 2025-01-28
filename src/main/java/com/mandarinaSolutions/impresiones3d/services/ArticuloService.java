package com.mandarinaSolutions.impresiones3d.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mandarinaSolutions.impresiones3d.dominio.Articulo;
import com.mandarinaSolutions.impresiones3d.dominio.Color;
import com.mandarinaSolutions.impresiones3d.repository.RepositoryArticulo;


@Service
public class ArticuloService {
	
	@Autowired
	private RepositoryArticulo repo;
	
	public Set<Articulo> getAll() {
		HashSet<Articulo> resultadoToSet = new HashSet<Articulo>(repo.findAll());
		return resultadoToSet;
	}
	
	public Articulo getArticulo(Integer id) {
		System.out.println("id " + id);
		return repo.findById(id).get();
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
