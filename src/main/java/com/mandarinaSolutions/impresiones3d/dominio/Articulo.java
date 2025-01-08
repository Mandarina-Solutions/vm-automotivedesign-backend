package com.mandarinaSolutions.impresiones3d.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="articulos")
public class Articulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String descripcion;
	
	@Column
	private Double precio;
	
	@Column
	private String titulo;
	
	@Column
	private String dimension;
	
	@Column
	private String imagen;
	
	@Column
	private Integer categoria;
}
