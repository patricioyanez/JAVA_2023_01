
public class TestEmpresa { // Principal
    public static void main(String[] args) {
        Puesto gerente = new Puesto(1, "Gerente");
        Puesto ejecutivo= new Puesto(1, "Ejecutivo");
        
        Empleado empleado1 = new Empleado("1-9", "Juan", "Masculino", 10, 50, gerente);
        Empleado empleado2 = new Empleado("2-7", "Adam", "Masculino",  3, 30, ejecutivo);
        
        RegistroEmpresa re = new RegistroEmpresa();
        
        re.agregar(empleado1);
        re.agregar(empleado2);
        
        Empleado aux = re.buscar("3-9");
        if( aux == null)
            System.out.println("Empleado no existe");
        else
        {
            System.out.println("Los datos del empleado son:");
            System.out.println(aux.imprimirDatos());
        }
        // listar todos los empleados
        System.out.println("\n\n************* Listado de empleados ***************");
        re.listar();
        System.out.println("******************************************************\n\n");
        // contar cuantos empleados existen en la clase contenedora
        System.out.println("Cantidad de empleados: " + re.contar());
        
        re.eliminar("1-9");
        
        System.out.println("Cantidad de empleados: " + re.contar());
    }
}
