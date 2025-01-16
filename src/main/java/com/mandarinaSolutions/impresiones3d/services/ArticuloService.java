package com.mandarinaSolutions.impresiones3d.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mandarinaSolutions.impresiones3d.dominio.Articulo;
import com.mandarinaSolutions.impresiones3d.repository.RepositoryArticulo;


@Service
public class ArticuloService {
	
	@Autowired
	private RepositoryArticulo repo;
	
	public List<Articulo> getArticulos() {
		return repo.findAll();
	}
	
	public Articulo getArticulo(Integer id) {
		return repo.findById(id).get();
	}
	
	public void addArticulo(Articulo articulo) {
		repo.save(articulo);
	}
	
	public void deleteArticulo(Integer id) {
		repo.deleteById(id);
	}
	
	public void updateArticulo(Articulo articulo) {
		repo.save(articulo);
	}
	
	
	
	
}
