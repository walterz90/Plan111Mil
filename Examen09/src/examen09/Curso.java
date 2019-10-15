
package examen09;

/**
 *
 * @author Capacitacion07
 */
public class Curso {
    
    public String getRecuperatirio(String tema, float calificacion) {
        String alum;
        
        Iterartor<String> itAlumno = alumnos.iterator();
        Iterator<Examen> itExamen = examenes.iterator();
        
        while(itAlumno.hasNext()) {
            Examen e = itExamen.next();
            alum = e.calificarRespuesta()
            
        }
        
        
        return alum;
    }
    
}
