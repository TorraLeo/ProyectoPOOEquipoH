package proyecto;

public class Alumno {
    String nombre;
    String apellidos;
    int edad;
    Direccion direccion;
    DatosAcademicos datosAc;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, int edad, Direccion direccion, DatosAcademicos datosAc) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.datosAc = datosAc;
    }

    public String getNombre() {
        return nombre;
    }

    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }
}
