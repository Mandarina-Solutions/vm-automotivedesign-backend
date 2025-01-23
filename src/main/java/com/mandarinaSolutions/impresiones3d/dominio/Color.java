package com.mandarinaSolutions.impresiones3d.dominio;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "color")
public class Color {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter
	public Integer id;
	
	@Column
	@Getter @Setter
	public String detalle;
	
	@Column
	@Getter @Setter
	public String hex_value;
	
	@Column
	@Getter @Setter
	public String extra;
	
	

	
	@Override
	public String toString() {
		return "Color "+
				"[id=" + id +
				", detalle=" + detalle +
				", hex_value=" + hex_value +
				", extra=" + extra +
				"]";
	}	

}
