
package modelo;

public class Automovil extends Vehiculo {
    private int litrosMaleteros;
    private int cantidadPuerta;

    public Automovil() {
        super();
        this.litrosMaleteros = 0;
        this.cantidadPuerta = 0;
    }
    
    public Automovil(int litrosMaleteros, int cantidadPuerta, String patente, String marca, String modelo, int precioServicioNeto, int valorIVA, int totalAPagar) {
        super(patente, marca, modelo, precioServicioNeto, valorIVA, totalAPagar);
        this.litrosMaleteros = litrosMaleteros;
        this.cantidadPuerta = cantidadPuerta;
    }

    public int getCantidadPuerta() {
        return cantidadPuerta;
    }

    public void setCantidadPuerta(int cantidadPuerta) {
        this.cantidadPuerta = cantidadPuerta;
    }

    public int getLitrosMaleteros() {
        return litrosMaleteros;
    }

    public void setLitrosMaleteros(int litrosMaleteros) {
        this.litrosMaleteros = litrosMaleteros;
    }
    
    
    
}
