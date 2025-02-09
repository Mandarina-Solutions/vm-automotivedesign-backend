package com.mandarinaSolutions.impresiones3d.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mandarinaSolutions.impresiones3d.DTO.ArticuloCarritoDTO;
import com.mandarinaSolutions.impresiones3d.dominio.Articulo;
import com.mandarinaSolutions.impresiones3d.exceptions.HttpConflictExist;
import com.mandarinaSolutions.impresiones3d.exceptions.HttpNotFoundException;
import com.mandarinaSolutions.impresiones3d.repository.RepositoryArticulo;

import jakarta.transaction.Transactional;


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
	
	public Articulo getByID(Integer id) throws HttpNotFoundException {
		if(!repo.existsById(id)) {
			throw new HttpNotFoundException();
		};
		Articulo articulo = repo.findById(id).get();
		return articulo;
	}
//	public Object mock1(Integer id) {
//		Articulo articulo = repo.findById(id).get();
//		return articulo.dimensiones_mm.toString();
//	}
	
//	public Object mock2(Integer id) {
//		return jsonLikeString;
//	}
//	
//	@Transactional(Transactional.TxType.REQUIRED)
	public void newArticulo(Articulo articuloNew) throws Exception{
		repo.save(articuloNew);
	}
	
	public void bajaFisica(Integer id) {
		repo.deleteById(id);
	}
	
	public void actualizar(Articulo articulo) {
		repo.save(articulo);
	}
	
	public void bajaLogica(Integer id) {
		Articulo articulo = repo.findById(id).get();
		articulo.setDisponible(false);
		repo.save(articulo);
	}
	
}
