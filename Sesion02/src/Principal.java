
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        // declarar variables
        String nombre;
        nombre = "Bruno";        
        String apellido = "Díaz";
        
        // imprimir valores
        System.out.println("EL nombre completo es:" + 
                            nombre + " " +
                            apellido);
        
        // pedir info via teclado
        Scanner leerTeclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre:");
        String nombre2 = leerTeclado.next();
        System.out.println("Hola " + nombre2 + "!");
        
        System.out.print("¿Qué edad tiene Ud.:");
        int edad = leerTeclado.nextInt();
        
        System.out.println("Ud tiene " + edad + " años");
        
        if(edad >= 18)
        {
            System.out.println("Ud es mayor de edad puede comprar alcohol");
        }
        
        if(edad >= 18)
        {
            System.out.println("Ud es mayor de edad puede comprar alcohol");
        }
        else
        {
            System.out.println("Ud es menor de edad no puede comprar alcohol");
        }
    }
}
