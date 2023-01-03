package proyecto;

import java.util.LinkedList;

public class Semestre {
    int numSemestre;
    LinkedList<String> asignaturas = new LinkedList<>();

    public Semestre() {
    }

    public Semestre(int numSemestre) {
        this.numSemestre = numSemestre;
    }

    public int getNumSemestre() {
        return numSemestre;
    }

    public void setNumSemestre(int numSemestre) {
        this.numSemestre = numSemestre;
    }

    public LinkedList<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(LinkedList<String> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
