
public class Pez extends Animal implements IOperaciones {

    @Override
    public void emitirSonido() {
        System.out.println("glu glu");
    }

    @Override
    public void consumoComida() {
        System.out.println("50gr de comida");
    }

    @Override
    public void calcularPrecioConIVA() {
        System.out.println("IVA                : " + IVA);
        System.out.println("Velocidad de la luz: " + C);
    }

    @Override
    public double calcularIMC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
