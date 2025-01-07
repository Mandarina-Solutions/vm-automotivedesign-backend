package com.mandarinaSolutions.impresiones3d.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Articulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;
	
	@Column
	@Getter
	@Setter
	private String descripcion;
	
	@Column
	@Getter
	@Setter
	private Double precio;
	
	@Column
	@Getter
	@Setter
	private String titulo;
	
	@Column
	@Getter
	@Setter
	private String dimension;
	
	@Column
	@Getter
	@Setter
	private String imagen;
	
	@Column
	@Getter
	@Setter
	private Long categoria;
//
////constructor para consultas
//	public Articulo(Long id, String descripcion, Double precio, String titulo, String dimension, String imagen,
//			Long categoria) {
//		super();
//		this.id = id;
//		this.descripcion = descripcion;
//		this.precio = precio;
//		this.titulo = titulo;
//		this.dimension = dimension;
//		this.imagen = imagen;
//		this.categoria = categoria;
//	}
//
//	// constructor para crear
//	public Articulo(String descripcion, Double precio, String titulo, String dimension, String imagen, Long categoria) {
//		super();
//		this.descripcion = descripcion;
//		this.precio = precio;
//		this.titulo = titulo;
//		this.dimension = dimension;
//		this.imagen = imagen;
//		this.categoria = categoria;
//	}

}
