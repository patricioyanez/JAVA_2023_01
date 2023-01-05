
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
        
        System.out.print("Ingrese un número:");
        int numero = leerTeclado.nextInt();
        
        if(numero < 10)
        {
            System.out.println("CON unidades");
        }
        else if(numero < 100)
        {
            System.out.println("CON decenas");
        }        
        else if(numero < 1000)
        {
            System.out.println("CON centenas");
        }
        else
        {
            System.out.println("CON otros");
        }
        
        // SOLICITAR LA EDAD Y CLASIFICAR SEGÚN RANGO ETARIO 
        // (NIÑO, ADOLESCENTE, ADULTO, 3RA EDAD)
        System.out.print("Ingrese su edad:");
        edad = leerTeclado.nextInt();
        
        if(edad < 12)
        {
            System.out.println("Ud es un niño");
        }
        else if(edad < 18)
        {
            System.out.println("Ud es adolescente");
        }        
        else if(edad < 65)
        {
            System.out.println("Ud es un adulto");
        }
        else
        {
            System.out.println("Ud está en la 3ra edad");
        }
        
    }
}
