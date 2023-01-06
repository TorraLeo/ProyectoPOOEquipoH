package proyecto;

public class DatosAcademicos {

    int numCuenta;
    int numInscripcion;
    int semestre;
    int materiasInscritas;
    int materiasAprobadas;
    int creditosAlumno;
    int creditosIngreso;
    float promedio;
    float escolaridad;
    float velocidad;

    public DatosAcademicos() {
    }

    public DatosAcademicos(int numCuenta, int numInscripcion, int semestre, int materiasInscritas, int materiasCursadas, int materiasAprobadas, int creditosAlumno, int creditosIngreso, float promedio, float escolaridad, float velocidad) {
        this.numCuenta = numCuenta;
        this.numInscripcion = numInscripcion;
        this.semestre = semestre;
        this.materiasInscritas = materiasInscritas;
        this.materiasAprobadas = materiasAprobadas;
        this.creditosAlumno = creditosAlumno;
        this.creditosIngreso = creditosIngreso;
        this.promedio = promedio;
        this.escolaridad = escolaridad;
        this.velocidad = velocidad;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getNumInscripcion() {
        return numInscripcion;
    }

    public void setNumInscripcion(int numInscripcion) {
        this.numInscripcion = numInscripcion;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getMateriasInscritas() {
        return materiasInscritas;
    }

    public void setMateriasInscritas(int materiasInscritas) {
        this.materiasInscritas = materiasInscritas;
    }

  

    public int getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(int materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public int getCreditosAlumno() {
        return creditosAlumno;
    }

    public void setCreditosAlumno(int creditosAlumno) {
        this.creditosAlumno = creditosAlumno;
    }

    public int getCreditosIngreso() {
        return creditosIngreso;
    }

    public void setCreditosIngreso(int creditosIngreso) {
        this.creditosIngreso = creditosIngreso;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public float getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(float escolaridad) {
        this.escolaridad = escolaridad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "\n\nDatosAcademicos:" + "\nnumCuenta = " + numCuenta + "\nnumInscripcion = " + numInscripcion + "\nsemestre = " + semestre + "\nmateriasInscritas = " + materiasInscritas + "\nmateriasAprobadas = " + materiasAprobadas + "\ncreditosAlumno = " + creditosAlumno + "\ncreditosIngreso = " + creditosIngreso + "\npromedio = " + promedio + "\nescolaridad = " + escolaridad + "\nvelocidad = " + velocidad + '\n';
    }

    
}
