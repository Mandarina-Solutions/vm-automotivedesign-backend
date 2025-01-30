package com.mandarinaSolutions.impresiones3d.querys;


public class ArticuloQuerys {
	
	public static final String DISPONIBLE = """
						SELECT a
						FROM Articulo a
						WHERE a.disponible=True
						""";
	public static final String CARRITO = """
						SELECT
						a.id, a.titulo, a.imagen_1, a.precio_lista, a.descuento
						FROM articulo a 
						WHERE a.id in :ids
						""";
	public static final String DIMENSIONES = """
			SELECT small->‘$.dimensiones_mm’ AS dimensiones
			FROM articulo
			WHERE your_condition;
			""";
	
}
