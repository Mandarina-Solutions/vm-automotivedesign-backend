package com.mandarinaSolutions.impresiones3d.DTO;


public class ArticuloCarritoDTO {

    public Integer id;
    public String titulo;
    public String imagen;
    public Double precio_lista;
    public Double descuento;
    
    public ArticuloCarritoDTO(
    		Integer id,
    		String titulo,
    		String imagen,
    		Double precio_lista,
    		Double descuento
    ){
        this.id = id;
        this.titulo = titulo;
        this.imagen = imagen;
        this.precio_lista = precio_lista;
        this.descuento = descuento;
    }

}

