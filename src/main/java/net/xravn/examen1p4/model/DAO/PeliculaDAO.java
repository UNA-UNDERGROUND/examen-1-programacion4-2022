package net.xravn.examen1p4.model.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.xravn.examen1p4.boilerplate.model.sql.DAO;
import net.xravn.examen1p4.boilerplate.model.sql.QueryBuilder;
import net.xravn.examen1p4.model.Pelicula;

public class PeliculaDAO extends DAO{
    public PeliculaDAO() {
        super();
    }

    public List<Pelicula> recuperarPeliculas() {
        List<Map<String, Object>> consulta //
                = ejecutarConsulta(queryObtenerPeliculas);
        List<Pelicula> resultado = new ArrayList<>();
        if (consulta != null) {
            try {
                for (Map<String, Object> fila : consulta) {
                    Pelicula pelicula = new Pelicula();
                    pelicula.setId((Integer) fila.get("id"));
                    pelicula.setTitulo((String) fila.get("titulo"));
                    pelicula.setFormato((String) fila.get("formato"));
                    pelicula.setSala((String) fila.get("sala"));
                    pelicula.setSala((String) fila.get("sala"));
                    resultado.add(pelicula);
                }
            } catch (Exception e) {
                System.err.println("Error al recuperar las categorias de productos");
            }
        }
        return resultado;
    }

    private static final String queryObtenerPeliculas 
            = new QueryBuilder() //
                .select("*") //
                .from("pelicula") //
                .build();
    
}
