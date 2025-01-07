package com.mandarinaSolutions.impresiones3d.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mandarinaSolutions.impresiones3d.dominio.Articulo;
import com.mandarinaSolutions.impresiones3d.repository.Repository;


@RestController
public class Controller {
	
	@Autowired
	private Repository repo;
	
	@GetMapping()
	public String get() {
		return "conectado";
	}
	
	@GetMapping("/articulos")
	public List<Articulo> getArticulos() {
		return repo.findAll();
	}
	
	@PostMapping("/crear")
	public Articulo crearArticulo(@RequestBody Articulo articulo) {
		return repo.save(articulo);
	}
	

}
