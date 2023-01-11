
public class Pulsera extends Joya{
    private String tipo; // tobillo o muñeca

    public Pulsera() {
        this.tipo = "";
    }
    
    public Pulsera(String tipo, int codigo, String nombre, String material) {
        super(codigo, nombre, material);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        public String imprimirDatos() {
        return "****** Anillo ******" + 
               "\nCodigo    : " + super.getCodigo() +
               "\nNombre    : " + super.getNombre() +
               "\nMaterial  : " + super.getMaterial()+
               "\nTipo      : " + this.tipo // this.getLargo()
                ;
    }
    
}
