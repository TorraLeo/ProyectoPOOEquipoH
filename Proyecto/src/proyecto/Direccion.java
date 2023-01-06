package proyectopoo;

public class Direccion {

    private int numRegistro;
    private int codigoPostal;
    private String estado;
    private String municipio;
    private String tipoAs;
    private String asentamiento;
    private int claveOf;

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipoAs() {
        return tipoAs;
    }

    public void setTipoAs(String tipoAs) {
        this.tipoAs = tipoAs;
    }

    public String getAsentamiento() {
        return asentamiento;
    }

    public void setAsentamiento(String asentamiento) {
        this.asentamiento = asentamiento;
    }

    public int getClaveOf() {
        return claveOf;
    }

    public void setClaveOf(int claveOf) {
        this.claveOf = claveOf;
    }

    @Override
    public String toString() {
        return "" + codigoPostal + " " + estado + " " + municipio + " " + tipoAs + " " + asentamiento + " " + claveOf;
    }

    

}
