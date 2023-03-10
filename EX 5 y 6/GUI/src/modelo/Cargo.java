
package modelo;


public class Cargo {
    private int id;
    private String nombre;

    public Cargo() {
        this.id = 0;
        this.nombre = "";
    }
    
    public Cargo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
