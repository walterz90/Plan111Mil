
package examen10;

import java.util.List;

/**
 *
 * @author capacitacion07
 */
public class Poliza {
    private int idPoliza;
    private List<ObjetoDeValor> objetoDeValor;
    
    public Poliza(int idPoliza) {
        this.idPoliza = idPoliza;
        this.objetoDeValor = new ArrayList<ObjectoDeValor>();
        
    }
    
    public void agregarObjetoDeValor(String nombre, double valor) {
        this.ObjetoDeValor.add(nombre, valor);
    }
    
    
}
