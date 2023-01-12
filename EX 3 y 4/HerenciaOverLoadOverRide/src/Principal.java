
public class Principal {
    public static void main(String[] args) {
        Cadena cadena1 = new Cadena(65, 1000, "Deluxe", "Oro 14k");
        
        System.out.println(cadena1.imprimirDatos());
        // sobrecarga de metodos
        System.out.println("Precio normal       : " + cadena1.precio());
        System.out.println("Precio 10% descuento: " + cadena1.precio(10));
        System.out.println("Precio en dolar     : " + cadena1.precio("dolar"));
        System.out.println("Precio en euro      : " + cadena1.precio("euro"));
    }
}
