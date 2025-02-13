package com.mandarinaSolutions.impresiones3d.querys;

public class CategoriaQuerys {
    public static final String CATEGORIAS_NAV = """
			SELECT 
				c.id, 
				c.nombre, 
				COUNT(a.id) as cantidad_articulos
			FROM 
				articulo a 
			INNER JOIN 
				articulo_categoria ac ON a.id = ac.id_articulo 
			INNER JOIN 
				categoria c ON ac.id_categoria = c.id 
			GROUP BY 
				c.nombre 
			HAVING 
				COUNT(a.id) > 0;
			""";
}
