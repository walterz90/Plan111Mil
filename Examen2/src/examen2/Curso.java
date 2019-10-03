
package examen2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombreCurso;
    private int cupo;
    private float notaAprobacion;
    private List<Inscripcion> incripciones;

    public Curso(String nombreCurso, int cupo, float notaAprobacion) {
        this.nombreCurso = nombreCurso;
        this.cupo = cupo;
        this.notaAprobacion = notaAprobacion;
        this.incripciones = new ArrayList<Inscripciones>();
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public float getNotaAprobacion() {
        return notaAprobacion;
    }
    
}
