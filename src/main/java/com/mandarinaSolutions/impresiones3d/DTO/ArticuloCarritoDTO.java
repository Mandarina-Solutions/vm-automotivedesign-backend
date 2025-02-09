package com.mandarinaSolutions.impresiones3d.DTO;


public class ArticuloCarritoDTO {

    public Integer id;
    public String titulo;
    public Double precio_lista;
    public Double descuento;
    public String imagen;
    
    public ArticuloCarritoDTO(
    		Integer id,
    		String titulo,
    		Double precio_lista,
    		Double descuento,
    		String imagen
    ){
        this.id = id;
        this.titulo = titulo;
        this.precio_lista = precio_lista;
        this.descuento = descuento;
        this.imagen = imagen;
    }

}

