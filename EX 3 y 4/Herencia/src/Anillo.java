
public class Anillo extends Joya {
    private float medida;

    public Anillo() {
        super();
        this.medida = 0;
    }
    
    public Anillo(float medida, int codigo, String nombre, String material) {
        super(codigo, nombre, material);
        this.medida = medida;
    }

    public float getMedida() {
        return medida;
    }

    public void setMedida(float medida) {
        this.medida = medida;
    }

    public String imprimirDatos() {
        return "****** Anillo ******" + 
               "\nCodigo    : " + super.getCodigo() +
               "\nNombre    : " + super.getNombre() +
               "\nMaterial  : " + super.getMaterial()+
               "\nMedida    : " + this.medida // this.getLargo()
                ;
    }
    
    
}
