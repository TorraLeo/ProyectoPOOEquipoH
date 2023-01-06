package proyecto;

public class Alumno {

    private int identificador;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private Direccion direccion;
    private ModuloDatosAcademicos datosAc;

    public Alumno() {
    }

    public Alumno(int identificador, String nombre, String apPaterno, String apMaterno, int edad, Direccion direccion, ModuloDatosAcademicos datosAc) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.direccion = direccion;
        this.datosAc = datosAc;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ModuloDatosAcademicos getDatosAc() {
        return datosAc;
    }

    public void setDatosAc(ModuloDatosAcademicos datosAc) {
        this.datosAc = datosAc;
    }
    
    

    @Override
    public String toString() {
        return "\nAlumno:" + "\nidentificador = " + identificador + "\nnombre = " + nombre + "\napPaterno = " + apPaterno + "\napMaterno = " + apMaterno + "\nedad = " + edad + "\ndireccion = " + direccion + datosAc + '\n';
    }

    
}
