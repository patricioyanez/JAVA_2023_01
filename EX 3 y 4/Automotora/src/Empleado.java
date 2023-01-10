
public class Empleado {
    private String rut;
    private String nombre;
    private String genero;
    private int anioServicio;
    private int edad;
    private Puesto puesto;
    
    public Empleado() {
        this.rut = "";
        this.nombre = "";
        this.genero = "";
        this.anioServicio = 0;
        this.edad = 0;
        this.puesto = new Puesto();
    }
    
    public Empleado(String rut, String nombre, String genero, int anioServicio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombre = nombre;
        this.genero = genero;
        this.anioServicio = anioServicio;
        this.edad = edad;
        this.puesto = puesto;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioServicio() {
        return anioServicio;
    }

    public void setAnioServicio(int anioServicio) {
        this.anioServicio = anioServicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String imprimirDatos()
    {
        String datos = "*******  Empleado  ******";
        datos += "\nRut             : " + this.rut;
        datos += "\nNombre          : " + this.nombre;
        datos += "\nGénero          : " + this.genero;
        datos += "\nAños de servicio: " + this.anioServicio;
        datos += "\nEdad            : " + this.edad;
 //       datos += "\nCódigo de puesto: " + this.puesto.getCodigo();
 //       datos += "\nNombre de puesto: " + this.puesto.getNombre();
        datos += this.puesto.imprimirDatos();
        return datos;
    }
}
