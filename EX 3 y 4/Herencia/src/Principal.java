
public class Principal {
    public static void main(String[] args) {
        Cadena cadena1 = new Cadena(45, 1000, "Deluxe", "Oro 14k");
        Cadena cadena2 = new Cadena(60, 2500, "Super Deluxe", "Oro 14k");
        
        cadena1.setMaterial("Oro 18k");        
        System.out.println(cadena1.imprimirDatos());
        
        cadena2.setLargo(80);
        cadena2.setMaterial("Oro 18k");
        System.out.println(cadena2.imprimirDatos());
        
        
        // crear 2 anillos e imprimir los datos que contienen
    }
}
