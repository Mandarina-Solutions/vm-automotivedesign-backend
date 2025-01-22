
package com.mandarinaSolutions.impresiones3d.dominio;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "articulo")
public class Articulo {

	//	LEER: 
	//	Los getters y setter deben estar en public si se usa Lombok.
	//	Sino, usar setter y getter manopla en public. JPA no tiene acceso sino
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    public Integer id;

    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    @Getter @Setter
    public Categoria id_categoria;
     
    @OneToMany(mappedBy="articulo")
    @Getter @Setter
    public Set<ArticuloColor> colores;
    
    @Column
    @Getter @Setter
    public String titulo;

    @Column
    @Getter @Setter
    public String detalle;
    
    @Column
    @Getter @Setter
    public String imagen_1;
    
    @Column
    @Getter @Setter
    public String imagen_2;
    
    @Column
    @Getter @Setter
    public String imagen_3;

    @Column
    @Getter @Setter
    public Double precio_lista;
    
    @Column
    @Getter @Setter
    public Double descuento;
    
    @Column
    @Getter @Setter
    public String dimension_mm;
        
}
