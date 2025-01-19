
package com.mandarinaSolutions.impresiones3d.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Table(name = "articulo")
public class Articulo {

	//	LEER: 
	//	Los getters y setter deben estar en public si se usa Lombok.
	//	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    public Integer id;

    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    @Getter @Setter
    public Categoria id_categoria;
     
    @ManyToOne
    @JoinColumn(name = "id_color", referencedColumnName = "id")
    @Getter @Setter
    public Color id_color;
    
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
    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC)
    private String dimension_mm;
    
    
//    public String getDimensiones_mm() {
//    	return this.dimension_mm;
//    }
//    public void setDimensiones_mm(String newDim) {
//    	this.dimension_mm = newDim;
//    }
    
}
