package com.mandarinaSolutions.impresiones3d.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mandarinaSolutions.impresiones3d.dominio.Categoria;
import com.mandarinaSolutions.impresiones3d.repository.RepositoryCategoria;

@RestController
public class ControllerCategoria {
	
	@Autowired
	private RepositoryCategoria repo;
	
	@GetMapping("categorias")
	public List<Categoria> getCategorias() {
		return repo.findAll();
	}
	
	@GetMapping("categorias/{id}")
	public Categoria getCategoria(@PathVariable Integer id) {
		return repo.findById(id).get();
	}
	
	@PostMapping("crearCategoria")
	public void addCategoria(@RequestBody Categoria categoria) {
		System.out.println(categoria);
		repo.save(categoria);
	}
	
	@DeleteMapping("borrarCategoria/{id}")
	public void deleteCategoria(@PathVariable Integer id) {
		repo.deleteById(id);
	}
	
	@PutMapping("actualizarCategoria")
	//	logica de actualizar
	public void updateCategoria(@RequestBody Categoria categoria) {
		repo.save(categoria);
	}

}
