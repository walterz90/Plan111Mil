
package examen09;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    
    
    public Examen() {
        this.preguntas = new ArrayList<Pregunta>();
        this.respuestasAlumnos = new ArrayList<List<String>>();
        this.alumnos = new ArrayList<String>();
        
    }
    public float calificarRespuesta(List<String> respuesta) {
        float puntt = 0;
        
        Iterator<Pregunta> itPreguntas = preguntas.iterator();
        Iterator<String> itRespuesta = respuesta.iterator();
        
        while(itPreguntas.hasNext()) {
            Pregunta p = itPreguntas.next();
            String r = itRespuesta.next();
            puntt += p.getPuntaje(r);
        }
        /*for(List<String> r : respuesta) {
            if(r.equals(preguntas))
                puntt += preguntas.getPuntaje(r);
                
        }*/
        return puntt; 
    }
}
