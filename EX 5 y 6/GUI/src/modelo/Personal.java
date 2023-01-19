
package modelo;

public class Personal {
    private int idPersonal;
    private Cargo cargo;
    private int rut;
    private String dv;
    private String nombre;
    private String apellido;
    private int sueldo;
    public Personal() {
        this.idPersonal = 0;
        this.cargo = new Cargo();
        this.rut = 0;
        this.dv = "";
        this.nombre = "";
        this.apellido = "";
        this.sueldo = 0;
    }
    public Personal(int idPersonal, Cargo cargo, int rut, String dv, String nombre, String apellido, int sueldo) {
        this.idPersonal = idPersonal;
        this.cargo = cargo;
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
