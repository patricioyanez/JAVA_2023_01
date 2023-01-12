
public final class Persona {
    private int rut;
    private String dv;
    private String nombre;

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String imprimirDatos() {
        return "Persona{" + "rut=" + rut + ", dv=" + dv + ", nombre=" + nombre + '}';
    }
    
}
