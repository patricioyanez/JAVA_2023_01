public class Principal {
    public static void main(String [] args)
    {
        System.out.println("Hola Mundo!");
        System.out.println("¿Cómo están?");
        
        // instancia de la clase
        Pizza pepperoni;
        pepperoni = new Pizza();
     
        Pizza napolitana = new Pizza();
        
        String mensaje = pepperoni.preparar();
        System.out.println(mensaje);
        System.out.println(pepperoni.calentar());
        
        mensaje = napolitana.preparar();
        System.out.println(mensaje);
        System.out.println(napolitana.calentar());
        
        System.out.println("Nombre:" + napolitana.getNombre());
        napolitana.setNombre("Napolitana");
        System.out.println("Nombre:" + napolitana.getNombre());
        
        napolitana.setTamano("Familiar");
        napolitana.setEstaEnPromocion(true);
        napolitana.setMasa("Gruesa");
        napolitana.setPrecio(9500);
        
        System.out.println(napolitana.imprimirDatos());
        
        pepperoni.setNombre("Pepperoni");
        pepperoni.setTamano("Personal");
        pepperoni.setEstaEnPromocion(false);
        pepperoni.setMasa("delgada");
        pepperoni.setPrecio(2500);
        System.out.println(pepperoni.imprimirDatos());
        
        Pizza pizza1 = new Pizza("BBQ", "Mediano", "a la piedra", 10000, false);
        System.out.println(pizza1.imprimirDatos());
    }
}
