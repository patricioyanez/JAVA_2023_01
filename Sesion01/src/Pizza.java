
public class Pizza {
    // 1.- atributos
    private String nombre;
    private String tamano;
    private String masa;
    private int precio;
    private boolean estaEnPromocion;
    // 2.- constructores
    public Pizza()
    {
        this.nombre = "";
        this.tamano = "";
        this.masa = "";
        this.precio = 0;
        this.estaEnPromocion = false;
        System.out.println("Constructor sin parametro");
    }

    public Pizza(String nombre, String tamano, String masa, int precio, boolean estaEnPromocion) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
        this.precio = precio;
        this.estaEnPromocion = estaEnPromocion;
    }
    
    
    // 3.- Getter and Setter, accesadores y mutadores    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstaEnPromocion() {
        return estaEnPromocion;
    }

    public void setEstaEnPromocion(boolean estaEnPromocion) {
        this.estaEnPromocion = estaEnPromocion;
    }
    // 4.- Métodos personalizados
    public String preparar()
    {
        return "La pizza se está preparando";
    }
    public String calentar()
    {
        String mensaje;
        mensaje = "La pizza se está calentando a 400 grados";
        return mensaje;
    }
    public String imprimirDatos()
    {
        String datos = "";
        datos = "\n******Información de la Pizza********";
        datos += "\nNombre      : " + this.nombre; 
        datos += "\nTamaño      : " + this.getTamano(); 
        datos += "\nMasa        : " + getMasa(); 
        datos += "\nPrecio      : " + getPrecio(); 
        datos += "\nCon oferta  : " + this.estaEnPromocion;
        return datos;
    }
}
