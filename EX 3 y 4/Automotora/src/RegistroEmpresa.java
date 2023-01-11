import java.util.ArrayList;

public class RegistroEmpresa {
    private ArrayList<Empleado> empleados;
    
    public RegistroEmpresa()
    {
        empleados = new ArrayList<Empleado>();
    }
    
    public Empleado buscar(String rut)
    {
        for (Empleado empleado : empleados) {
            if(empleado.getRut().equalsIgnoreCase(rut))
                return empleado;
        }
        return null;
    }
    
    public boolean agregar(Empleado empleado)
    {
        if(this.buscar(empleado.getRut()) == null)
        {
            empleados.add(empleado);
            return true;
        }
        else
            return false;
    }
    
    public void listar()
    {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.imprimirDatos());
        }
    }
    
    public boolean eliminar(String rut)
    {
        for (Empleado empleado : empleados) {
            if(this.buscar(rut)!= null)
            {
                empleados.remove(empleado);
                return true;
            }
        }
        return false;
    }
}
