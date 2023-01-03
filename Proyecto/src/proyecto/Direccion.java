package proyecto;

public class Direccion {
    String calle;
    String colonia;
    String delegacion;
    int codigoPostal;

    public Direccion() {
    }

    public Direccion(String calle, String colonia, String delegacion, int codigoPostal) {
        this.calle = calle;
        this.colonia = colonia;
        this.delegacion = delegacion;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
