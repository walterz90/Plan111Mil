
package examen8;

import java.util.List;

public class Revista {
    private List<Articulo> elementos;
    private String titulo;
    private int ejemplar;
    
    public Articulo getArticuloEnPosicion(int posicion) {
        if(posicion >= elementos.size() || posicion <= 0) 
            return null;
        
        return elementos.get(posicion);
    }
    public int getCantidadArticulosDeTema(String tema) {
        int cantidad = 0;
        for (Articulo e : elementos) {
            if(e.contieneTema(tema))
                cantidad++;
        }
        return cantidad;
    }
}
