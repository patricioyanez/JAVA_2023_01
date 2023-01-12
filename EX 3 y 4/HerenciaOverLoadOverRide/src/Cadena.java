
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


    @Override
    public String imprimirDatos() {
        return "****** Cadena ******" + 
               "\nCodigo    : " + super.getCodigo() +
               "\nNombre    : " + super.getNombre() +
               "\nMaterial  : " + super.getMaterial()+
               "\nLargo     : " + this.largo // this.getLargo()
                ;
    }
    
    
    // sobrecarga de métodos
    
    public int precio()
    {
        int resultado = 0;
        int precio = 0;
        if(super.getMaterial().toUpperCase().contains("ORO"))
            precio = 15000;

        if(super.getMaterial().toUpperCase().contains("PLATA"))       
            precio = 4500;
         
        resultado = precio * this.largo; 
        return resultado;
    }
    public int precio(int porcentajeDescuento)
    {
        int resultado = 0;
        int precio = 0;
        if(super.getMaterial().toUpperCase().contains("ORO"))
            precio = 15000;

        if(super.getMaterial().toUpperCase().contains("PLATA"))       
            precio = 4500;
        
        precio = precio * this.largo;
        resultado = precio - (precio *porcentajeDescuento /100); 
        return resultado;
    }
    public double precio(String moneda)
    {
        int precio = this.precio();
        double resultado = 0.0;
        if(moneda.equalsIgnoreCase("DOLAR"))
            resultado = precio / 800;
        else if(moneda.equalsIgnoreCase("EURO"))
            resultado = precio / 860;
        return resultado;
    }
}
