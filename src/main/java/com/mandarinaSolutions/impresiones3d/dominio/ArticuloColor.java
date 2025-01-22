package com.mandarinaSolutions.impresiones3d.dominio;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Embeddable
class ArticuloColorKey implements Serializable {

	@Column(name = "id_articulo")
    Integer idArticulo;

    @Column(name = "id_color")
    Integer idColor;

    // standard constructors, getters, and setters
    // hashcode and equals implementation
}

@Entity
@Table(name="articulo-color")
class ArticuloColor {

    @EmbeddedId
    ArticuloColorKey id;

    @ManyToOne
    @MapsId("idArticulo")
    @JoinColumn(name = "id_articulo")
    Articulo articulo;

    @ManyToOne
    @MapsId("idColor")
    @JoinColumn(name = "id_color")
    Color color;
    
    // standard constructors, getters, and setters
}
