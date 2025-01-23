
package com.mandarinaSolutions.impresiones3d.dominio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    @Getter @Setter
    public Categoria categoria;
     
    @ManyToMany
    @JoinTable(name = "articulo_color",
	    joinColumns = @JoinColumn(name = "id_articulo"),
	    inverseJoinColumns = @JoinColumn(name = "id_color")
    )
    @Getter @Setter
    public Set<Color> colores =  new HashSet<>();
    
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
