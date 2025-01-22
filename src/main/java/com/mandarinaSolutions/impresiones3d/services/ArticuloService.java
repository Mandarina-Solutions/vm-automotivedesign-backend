package com.mandarinaSolutions.impresiones3d.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mandarinaSolutions.impresiones3d.dominio.Articulo;
import com.mandarinaSolutions.impresiones3d.repository.RepositoryArticulo;


@Service
public class ArticuloService {
	
	@Autowired
	private RepositoryArticulo repo;
	
	public List<Articulo> getAll() {
		return repo.findAll();
	}
	
	public Articulo getArticulo(Integer id) {
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
	
	public Articulo mock() {
		return repo.articulosBasic();
	}
	
	public String titulo() {
		return repo.titulo();
	}
}
