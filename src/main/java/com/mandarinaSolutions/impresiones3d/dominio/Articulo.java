
package com.mandarinaSolutions.impresiones3d.dominio;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.mandarinaSolutions.impresiones3d.converter.ArticuloDimensionesConverter;
import com.mandarinaSolutions.impresiones3d.converter.ArticuloImagenesConverter;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
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
public class Articulo{

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

	@Column(length=255)
	@Getter @Setter
	public String detalle;

	@Column(length=50)
	@Getter @Setter
	public String imagen;
	

	@Column
	@Convert(converter=ArticuloImagenesConverter.class)
	@Getter @Setter
	public List<String> imagenes_extra;

	@Column
	@Getter @Setter
	public Double precio_lista;

	@Column
	@Getter @Setter
	public Double descuento;
	
	@Column
	@Convert(converter=ArticuloDimensionesConverter.class)
	@Getter @Setter
	public Map<String,String> dimensiones_mm;

	@Column
	@Getter @Setter
	@JsonIgnore
	public Boolean disponible;


}
