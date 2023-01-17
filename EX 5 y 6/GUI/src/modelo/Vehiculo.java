
package modelo;


public abstract class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private int precioServicioNeto;
    private int valorIVA;
    private int totalAPagar;

    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.modelo = "";
        this.precioServicioNeto = 0;
        this.valorIVA = 0;
        this.totalAPagar = 0;
    }
    public Vehiculo(String patente, String marca, String modelo, int precioServicioNeto, int valorIVA, int totalAPagar) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.precioServicioNeto = precioServicioNeto;
        this.valorIVA = valorIVA;
        this.totalAPagar = totalAPagar;
    }

    public int getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(int totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecioServicioNeto() {
        return precioServicioNeto;
    }

    public void setPrecioServicioNeto(int precioServicioNeto) {
        this.precioServicioNeto = precioServicioNeto;
    }

    public int getValorIVA() {
        return valorIVA;
    }

    public void setValorIVA(int valorIVA) {
        this.valorIVA = valorIVA;
    }
    
}
