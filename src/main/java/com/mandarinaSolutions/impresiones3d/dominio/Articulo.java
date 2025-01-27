
package com.mandarinaSolutions.impresiones3d.dominio;

import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "articulo")
public class Articulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter
	public Integer id;

	//CHEQUEAR EL <FetchType.EAGER>
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "articulo_categoria",
		joinColumns = @JoinColumn(name = "id_articulo"),
		inverseJoinColumns = @JoinColumn(name = "id_categoria")
	)
	@Getter @Setter
	public Set<Categoria> categorias;
	
	//CHEQUEAR EL <FetchType.EAGER>
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "articulo_color",
		joinColumns = @JoinColumn(name = "id_articulo"),
		inverseJoinColumns = @JoinColumn(name = "id_color")
	)
	@Getter @Setter
	public Set<Color> colores;

	@Column(length=50)
	@Getter @Setter
	public String titulo;

	@Column
	@Getter @Setter
	public String detalle;

	@Column(length=50)
	@Getter @Setter
	public String imagen_1;

	@Column(length=50)
	@Getter @Setter
	public String imagen_2;

	@Column(length=50)
	@Getter @Setter
	public String imagen_3;

	@Column(length=50)
	@Getter @Setter
	public String imagen_4;

	@Column(length=50)
	@Getter @Setter
	public String imagen_5;

	@Column
	@Getter @Setter
	public Double precio_lista;

	@Column
	@Getter @Setter
	public Double descuento;

	@Column(length=50)
	@Getter @Setter
	public String dimension_mm;

	@Column
	@Getter @Setter
	public Boolean disponible;

}
