
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
        
        Anillo anillo1 = new Anillo(15.5f, 3000, "compromiso", "Plata 925");
        Anillo anillo2 = new Anillo(17.5f, 4000, "Matrimonio", "Oro con diamante");
        
        System.out.println(anillo1.imprimirDatos());
        System.out.println(anillo2.imprimirDatos());
        
        Pulsera p = new Pulsera("Tobillo", 7000, "Pulsera tobillera", "Plata 900");
        System.out.println(p.imprimirDatos());
        
    }
}
