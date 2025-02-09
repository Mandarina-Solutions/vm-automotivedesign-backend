
package com.mandarinaSolutions.impresiones3d.dominio;


import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "articulo")
public class Articulo{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter
	public Integer id = null;

	@ManyToMany(
			fetch = FetchType.LAZY,
			cascade = CascadeType.MERGE
	)
	@JoinTable(
		name = "articulo_categoria",
		joinColumns = @JoinColumn(name = "id_articulo"),
		inverseJoinColumns = @JoinColumn(name = "id_categoria")
	)
	@Getter @Setter
	public List<Categoria> categorias;
	

	@ManyToMany(
			fetch = FetchType.LAZY,
			cascade = CascadeType.MERGE
	)
	@JoinTable(name = "articulo_color",
		joinColumns = @JoinColumn(name = "id_articulo"),
		inverseJoinColumns = @JoinColumn(name = "id_color")
	)
	@Getter @Setter
	public Set<Color> colores;
	
	@OneToMany
	@JoinColumn(name="articulo_id")
	@Getter @Setter
	public List<Dimension> dimensiones_mm;
	
	@OneToMany
	@JoinColumn(name="articulo_id")
	@Getter @Setter
	public List<Imagen> imagenes;
	
	@Column(length=50)
	public String titulo;

	@Column(length=255)
	public String detalle;

	@Column
	public Double precio_lista;

	@Column
	public Double descuento;
	
	@Column
	@JsonIgnore
	public Boolean disponible = true;

//	////////////////////////////////////
//	GETTERS AND SETTERS SIMPLES
//	////////////////////////////////////
	public String getTitulo(){	return this.titulo;	};
	public void setTitulo(String newTitulo){	this.titulo = newTitulo;	};

	public String getDetalle(){	return this.detalle;	};
	public void setDetalle(String newDetalle){	this.detalle= newDetalle;	};

	public Double getPrecio(){	return this.precio_lista;	};
	public void setPrecio(Double newPrecio){	this.precio_lista= newPrecio;	};
	
	public Double getDescuento(){	return this.descuento;	};
	public void setDescuento(Double newDescuento){	this.descuento= newDescuento;	};
	
	public Boolean getDisponible(){	return this.disponible;	};
	public void setDisponible(Boolean newDisponible){	this.disponible= newDisponible;	};
	
//	////////////////////////////////////
//	GETTERS AND SETTERS con LOGICA
//	////////////////////////////////////
}
