
public class Cadena extends Joya {
    private int largo;
    
    public Cadena() {
//        super();
        this.largo = 0;
    }
    
    public Cadena(int largo, int codigo, String nombre, String material) {
        super(codigo, nombre, material);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }


    public String imprimirDatos() {
        return "****** Cadena ******" + 
               "\nCodigo    : " + super.getCodigo() +
               "\nNombre    : " + super.getNombre() +
               "\nMaterial  : " + super.getMaterial()+
               "\nLargo     : " + this.largo // this.getLargo()
                ;
    }
    
    
    
}
