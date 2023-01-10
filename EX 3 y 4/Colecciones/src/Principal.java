import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        
        // agregar elemento
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Diego");
        // error: no es de tipo String
        //nombres.add(true);
        // cantidad de elementos de la colección
        int cantidad = 0;
        cantidad = nombres.size();
        System.out.println("Tamaño de la colección: " + cantidad);
    
        nombres.add("Francisco");
        System.out.println("Tamaño de la colección: " + nombres.size());
        // eliminar un elemento
        nombres.remove(3);
        //nombres.remove("Francisco"); // eliminar con texto
        System.out.println("Tamaño de la colección: " + nombres.size());
        
        nombres.add("Francisco");
        nombres.add("Diana");
        nombres.add("Ignacia");
        nombres.add("María");
        
        // recorrer la colección
        for(String aux: nombres)
        {
            System.out.println("EL nombre es: " + aux);
        }
        // uso de indice para recorrer colección
        // rescatar un valor de la colección
        for (int i = 0; i < nombres.size(); i++) {            
            System.out.println("El nombre del indice " + i +": " + nombres.get(i));
        }
        
        // buscar un valor si existe
        String nombreBuscado = "francisco";
        for (String nombre : nombres) {
            if(nombre.equalsIgnoreCase(nombreBuscado))
                System.out.println("El nombre ya existe");
        }
        // busca indice del elemento a buscar. Si no existe devuelve -1
        if(nombres.indexOf("Francisco")>= 0)
            System.out.println("El nombre ya existe");
        
        if(nombres.indexOf("Anita") == -1)
            System.out.println("El nombre NO  existe");
        
        if(nombres.contains("Francisco"))
            System.out.println("El nombre ya existe"); 
        if(nombres.contains("Anita"))
            System.out.println("El nombre ya existe");
        else
            System.out.println("El nombre Anita NO  existe");
         
        // elimina todos los datos de la colección
        nombres.clear();
        System.out.println("Cantidad de elementos:" + nombres.size());
    }
}
