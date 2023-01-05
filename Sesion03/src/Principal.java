import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        System.out.print("Ingrese un número:");
        int numero = leerTeclado.nextInt();
        int contador = 1;
        while(contador <= numero)
        {
            System.out.println("Número: " + contador);
            contador++; // contador = contador + 1;
        }
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Número FOR: " + i);
        }
        System.out.println("Fin de la aplicación");
    }
}
