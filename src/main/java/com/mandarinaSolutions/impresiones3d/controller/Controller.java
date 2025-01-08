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

import com.mandarinaSolutions.impresiones3d.dominio.Articulo;
import com.mandarinaSolutions.impresiones3d.repository.Repository;

@RestController
public class Controller {
	
	@Autowired
	private Repository repo;
	
	@GetMapping("articulos")
	public List<Articulo> getArticulos() {
		return repo.findAll();
	}
	
	@GetMapping("articulos/{id}")
	public Articulo getArticulo(@PathVariable Integer id) {
		return repo.findById(id).get();
	}
	
	@PostMapping("crearArticulo")
	public void addArticulo(@RequestBody Articulo articulo) {
		System.out.println(articulo);
		repo.save(articulo);
	}
	
	@DeleteMapping("borrarArticulo/{id}")
	public void deleteArticulo(@PathVariable Integer id) {
		repo.deleteById(id);
	}
	
	@PutMapping("actualizarArticulo")
//	logica de actualizar
	public void updateArticulo(@RequestBody Articulo articulo) {
		repo.save(articulo);
	}
	
	
	
	
}
