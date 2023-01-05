
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int n1 = 0;
        int n2 = 0;
        int total = 0;
        while(opcion != 5)
        {
            System.out.println("|********** Menú **********|");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");
            System.out.print("Seleccione la una opción: ");
            opcion = leer.nextInt();
            
            if(opcion < 1 || opcion > 5)
            {
                System.out.println("Opción no válida");
                System.out.println("Presione C y enter para continuar");
                leer.next();
                continue;
            }
            else if(opcion == 5)
            {
                break;
            }
            System.out.println("Ingrese 1er número: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese 2do número: ");
            n2 = leer.nextInt();
            if(opcion == 1)
            {
                total = n1 + n2; 
            }
            else if(opcion == 2)
            {
                total = n1 - n2; 
            }
            else if(opcion == 3)
            {
                total = n1 * n2; 
            }
            else if(opcion == 4)
            {
                total = n1 / n2; 
            }
            
            System.out.println("El resultado es: " + total);
            System.out.println("Presione C y enter para continuar");
            leer.next();
        }
        System.out.println("FIN DE LA APLICACIÓN");
    }
}
