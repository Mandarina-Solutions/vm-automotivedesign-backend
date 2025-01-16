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
import com.mandarinaSolutions.impresiones3d.services.ArticuloService;

@RestController
public class ControllerArticulo {
	
	@Autowired
	private ArticuloService service;
	
	@GetMapping("articulos")
	public List<Articulo> obtenerArticulos() {
		return service.getArticulos();
	}
	
	@GetMapping("articulos/{id}")
	public Articulo obtenerArticulo(@PathVariable Integer id) {
		return service.getArticulo(id);
	}
	
	@PostMapping("crearArticulo")
	public void crearArticulo(@RequestBody Articulo articulo) {
		service.addArticulo(articulo);
	}
	
	@DeleteMapping("borrarArticulo/{id}")
	public void eliminarArticulo(@PathVariable Integer id) {
		service.deleteArticulo(id);
	}
	
	@PutMapping("actualizarArticulo")
//	logica de actualizar
	public void actualizarArticulo(@RequestBody Articulo articulo) {
		service.updateArticulo(articulo);
	}
	
	
	
	
}
