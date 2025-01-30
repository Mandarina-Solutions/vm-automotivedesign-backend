package com.mandarinaSolutions.impresiones3d.services;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mandarinaSolutions.impresiones3d.DTO.ArticuloCarritoDTO;
import com.mandarinaSolutions.impresiones3d.dominio.Articulo;
import com.mandarinaSolutions.impresiones3d.repository.RepositoryArticulo;


@Service
public class ArticuloService {
	
	@Autowired
	private RepositoryArticulo repo;
	
	public Set<Articulo> getAll() {
		Set<Articulo> resultadoToSet = new HashSet<>(repo.findAll());
		return resultadoToSet;
	}
	
	public List<ArticuloCarritoDTO> getCarrito(List<Integer> ids) {
		List<ArticuloCarritoDTO> carrito = repo.getCarrito(ids);
		return carrito;
	}
	
	public Articulo getByID(Integer id) {
		Articulo articulo = repo.findById(id).get();
		return articulo;
	}
//	public Object mock(Integer id) {
//		Articulo articulo = repo.findById(id).get();
//
//		ObjectMapper objectMapper = new ObjectMapper();
//		try {
//			return objectMapper.readValue(
//					articulo.imagenes_extra,
//					new TypeReference<List<String>>(){}
//			);
//		} catch (JsonMappingException e) {
//			return Map.of("error",e.toString());
//		} catch (JsonProcessingException e) {
//			return Map.of("error",e.toString());
//		}
//	}
	
	public void newArticulo(Articulo articulo) {
		repo.save(articulo);
	}
	
	public void bajaFisica(Integer id) {
		repo.deleteById(id);
	}
	
	public void actualizar(Articulo articulo) {
		repo.save(articulo);
	}
	
	public void bajaLogica(Integer id) {
		Articulo articulo = repo.findById(id).get();
//		articulo.disponibilidad = false;
		repo.save(articulo);
	}
	
}
