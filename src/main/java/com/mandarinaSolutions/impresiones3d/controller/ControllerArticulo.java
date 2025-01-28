package com.mandarinaSolutions.impresiones3d.controller;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:5173"})
public class ControllerArticulo {
	
	@Autowired
	private ArticuloService service;
	
	@GetMapping("articulos")
	public Set<Articulo> obtenerArticulos() {
		return service.getAll();
	};
	
	@GetMapping("articulos/{id}")
	public Articulo obtenerArticulo(@PathVariable Integer id) {
		return service.articuloByID(id);
	}
	
	@PostMapping("crearArticulo")
	public void crearArticulo(@RequestBody Articulo articulo) {
		service.addArticulo(articulo);
	}
	
	@DeleteMapping("borrarArticulo/{id}")
	public void eliminarArticulo(@PathVariable Integer id) {
		service.deleteById(id);
	}
	
	@PutMapping("actualizarArticulo")
//	logica de actualizar
	public void actualizarArticulo(@RequestBody Articulo articulo) {
		service.updateArticulo(articulo);
	}
	
	@GetMapping("mock")
	public Set<Articulo> mock() {
		return service.mock();
	}
	
}
