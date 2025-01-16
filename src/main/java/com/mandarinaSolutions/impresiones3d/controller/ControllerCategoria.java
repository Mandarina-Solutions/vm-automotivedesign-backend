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
import com.mandarinaSolutions.impresiones3d.services.CategoriaService;

@RestController
public class ControllerCategoria {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping("categorias")
	public List<Categoria> obtenerCategorias() {
		return service.getCategorias();
	}
	
	@GetMapping("categorias/{id}")
	public Categoria obtenerCategoria(@PathVariable Integer id) {
		return service.getCategoria(id);
	}
	
	@PostMapping("crearCategoria")
	public void crearCategoria(@RequestBody Categoria categoria) {
		service.addCategoria(categoria);
	
	}
	
	@DeleteMapping("borrarCategoria/{id}")
	public void eliminarCategoria(@PathVariable Integer id) {
		service.deleteCategoria(id);
	}
	
	@PutMapping("actualizarCategoria")
	//	logica de actualizar
	public void actualizarCategoria(@RequestBody Categoria categoria) {
		service.updateCategoria(categoria);
	}

}
