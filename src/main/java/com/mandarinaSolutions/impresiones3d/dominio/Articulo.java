package com.mandarinaSolutions.impresiones3d.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "articulos")
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
    
    
    public Integer getId() {
  		return id;
  	}

  	public void setId(Integer id) {
  		this.id = id;
  	}

  	public String getDescripcion() {
  		return descripcion;
  	}

  	public void setDescripcion(String descripcion) {
  		this.descripcion = descripcion;
  	}

  	public Double getPrecio() {
  		return precio;
  	}

  	public void setPrecio(Double precio) {
  		this.precio = precio;
  	}

  	public String getTitulo() {
  		return titulo;
  	}

  	public void setTitulo(String titulo) {
  		this.titulo = titulo;
  	}

  	public String getDimension() {
  		return dimension;
  	}

  	public void setDimension(String dimension) {
  		this.dimension = dimension;
  	}

  	public String getImagen() {
  		return imagen;
  	}

  	public void setImagen(String imagen) {
  		this.imagen = imagen;
  	}

  	public Integer getCategoria() {
  		return categoria;
  	}

  	public void setCategoria(Integer categoria) {
  		this.categoria = categoria;
  	}

  	@Override
  	public String toString() {
  		return "Articulo [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", titulo=" + titulo
  				+ ", dimension=" + dimension + ", imagen=" + imagen + ", categoria=" + categoria + "]";
  	}
    
}
