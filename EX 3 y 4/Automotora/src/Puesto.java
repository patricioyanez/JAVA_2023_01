
public class Puesto {
    private int codigo;
    private String nombre;

    public Puesto() {
        this.codigo = 0;
        this.nombre = "";
    }
    
    public Puesto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String imprimirDatos()
    {
        String datos = "\nCodigo          : " + this.codigo +
                        "\nNombre          : " + this.nombre;
        return datos;
    }
}
