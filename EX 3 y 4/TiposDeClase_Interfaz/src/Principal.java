
public class Principal {
    public static void main(String[] args) {
        // da error porque es una clase abstracta
        //Animal a = new Animal();
        
        String nombre;
        
        Persona p = new Persona();
        
        
        IOperaciones pe = new Pez();
        pe.calcularPrecioConIVA();
    }
}
