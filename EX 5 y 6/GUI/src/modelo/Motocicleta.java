
package modelo;

public class Motocicleta extends Vehiculo{
    private int largoManillar;
    private String estilo;

    public Motocicleta() {
        super();
        this.largoManillar = largoManillar;
        this.estilo = "";
    }
    
    public Motocicleta(int largoManillar, String estilo, String patente, String marca, String modelo, int precioServicioNeto, int valorIVA, int totalAPagar) {
        super(patente, marca, modelo, precioServicioNeto, valorIVA, totalAPagar);
        this.largoManillar = largoManillar;
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getLargoManillar() {
        return largoManillar;
    }

    public void setLargoManillar(int largoManillar) {
        this.largoManillar = largoManillar;
    }
    
    
}
