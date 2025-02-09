package com.mandarinaSolutions.impresiones3d.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mandarinaSolutions.impresiones3d.DTO.ArticuloCarritoDTO;
import com.mandarinaSolutions.impresiones3d.dominio.Articulo;
import com.mandarinaSolutions.impresiones3d.exceptions.HttpNotFoundException;
import com.mandarinaSolutions.impresiones3d.services.ArticuloService;

@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:5173"})
public class ControllerArticulo {
	
	@Autowired
	private ArticuloService service;
	
	private static final String basePath = "articulos";
	// //////////////////////////////////////////////
	//GET`s	
	// //////////////////////////////////////////////
	@GetMapping(basePath)
	public Set<Articulo> getArticulos() {
		return service.getAll();
	};
	
	@GetMapping(basePath + "/{id}")
	public Articulo getArticuloByID(@PathVariable Integer id) throws HttpNotFoundException {
		return service.getByID(id);
	}
	
	@GetMapping(basePath + "/carrito")
	public List<ArticuloCarritoDTO> getCarrito(@RequestBody List<Integer> ids) {
		return service.getCarrito(ids);
	};
	
//	@GetMapping(basePath + "/mock1/{id}")
//	public Object mock1(@PathVariable Integer id) {
//		return service.mock1(id);
//	};

	// //////////////////////////////////////////////
	// POST`s	
	// //////////////////////////////////////////////
	//	falta agregregarle algun pathParam para chequear el logueo
	@PostMapping(basePath + "/new")
	public void newArticulo(@RequestBody Articulo articulo) throws Exception{
		service.newArticulo(articulo);
	}
	
	// //////////////////////////////////////////////
	// DELETE`s	
	// //////////////////////////////////////////////
	//	falta agregregarle algun pathParam para chequear el logueo
	@DeleteMapping(basePath + "/delete/{id}")
	public void deleteArticulo(@PathVariable Integer id) {
		service.bajaFisica(id);
	}
	
	// //////////////////////////////////////////////
	// PUT`s	
	// //////////////////////////////////////////////
	//	falta agregregarle algun pathParam para chequear el logueo
	@PutMapping(basePath + "/update")
	public void updateInfo(@RequestBody Articulo articulo) {
		service.actualizar(articulo);
	}
	
	@PutMapping(basePath + "/update/{id}")
	public void updateDisponibilidad(@PathVariable Integer id) {
		service.bajaLogica(id);
	}
	
}
