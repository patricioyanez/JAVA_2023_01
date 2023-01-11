
public class Joya {
    private int codigo;
    private String nombre;
    private String material;

    public Joya() {
        this.codigo = 0;
        this.nombre = "";
        this.material = "";
    }
    
    public Joya(int codigo, String nombre, String material) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public String imprimirDatos() {
        return "**** Joya ****" +
                "\nCodigo  : " + codigo + 
                "\nNombre  : " + nombre + 
                "\nMaterial: " + material;
    }
    
    
}
