package com.mandarinaSolutions.impresiones3d.querys;


public class ArticuloQuerys {
	
	public static final String DISPONIBLE = """
			SELECT 
				a
			FROM
				Articulo a
			WHERE
				a.disponible=True
			""";

	public static final String CARRITO = """
			SELECT
				a.id,
				a.titulo,
				a.precio_lista,
				a.descuento,
				i.path AS imagen
			FROM
				articulo a
			JOIN
				imagen i ON a.id = i.articulo_id
			WHERE
				a.id in :ids
			""";
	
	public static final String HOME = """
			SELECT
				a.id,
				a.titulo,
				a.precio_lista,
				a.descuento,
				i.path AS imagen
			FROM
				articulo a
			JOIN
				imagen i ON a.id = i.articulo_id
			WHERE 
				a.disponible = True
			""";
}
