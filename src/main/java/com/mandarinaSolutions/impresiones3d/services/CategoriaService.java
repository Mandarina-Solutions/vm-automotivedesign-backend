package com.mandarinaSolutions.impresiones3d.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mandarinaSolutions.impresiones3d.dominio.Categoria;
import com.mandarinaSolutions.impresiones3d.repository.RepositoryCategoria;

@Service
public class CategoriaService {
	
	@Autowired
	private RepositoryCategoria repo;
	
	public List<Categoria> getCategorias() {
		return repo.findAll();
	}
	
	public Categoria getCategoria(Integer id) {
		return repo.findById(id).get();
	}
	
	public void addCategoria(Categoria categoria) {
		repo.save(categoria);
	}
	
	public void deleteCategoria(Integer id) {
		repo.deleteById(id);
	}
	
	public void updateCategoria(Categoria categoria) {
		repo.save(categoria);
	}

	public List<Categoria> getCategoriasNav() {
		return repo.getCategoriasNav();
	}
}
