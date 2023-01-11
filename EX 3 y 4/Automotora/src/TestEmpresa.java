
public class TestEmpresa { // Principal
    public static void main(String[] args) {
        Puesto gerente = new Puesto(1, "Gerente");
        Puesto ejecutivo= new Puesto(1, "Ejecutivo");
        
        Empleado empleado1 = new Empleado("1-9", "Juan", "Masculino", 10, 50, gerente);
        Empleado empleado2 = new Empleado("2-7", "Adam", "Masculino",  3, 30, ejecutivo);
        
        RegistroEmpresa re = new RegistroEmpresa();
        
        re.agregar(empleado1);
        re.agregar(empleado2);
        
        Empleado aux = re.buscar("1-9");
        if( aux == null)
            System.out.println("Empleado no existe");
        else
        {
            System.out.println("Los datos del empleado son:");
            System.out.println(aux.imprimirDatos());
        }
        
        // contar cuantos empleados existen en la clase contenedora
        
    }
}
