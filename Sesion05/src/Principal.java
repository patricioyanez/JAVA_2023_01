import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un texto:");
        String texto = leer.next();
        
        System.out.println("cantidad de caracteres:" + texto.length());
        
        if(texto == "hola")
            System.out.println("es Igual");
        else
            System.out.println("NO es Igual");
        
        if(texto.equals("hola"))
            System.out.println("es Igual");
        else
            System.out.println("NO es Igual");
                
        if(texto.equalsIgnoreCase("hola"))
            System.out.println("es Igual");
        else
            System.out.println("NO es Igual");
        
        String texto2 = "   hola   ";
        System.out.println("___" + texto2 + "___");
        System.out.println("___" + texto2.trim() + "___");
    }   
}
