
public class Pez extends Animal {
    private int cantidadAleta;
    public Pez() {
        super();
        this.cantidadAleta = 0;
    }
    
    public Pez(int cantidadAleta, int id, int peso, String nombre, String nombreCientifico, String grupoAlimenticio) {
        super(id, peso, nombre, nombreCientifico, grupoAlimenticio);
        this.cantidadAleta = cantidadAleta;
    }

    public int getCantidadAleta() {
        return cantidadAleta;
    }

    public void setCantidadAleta(int cantidadAleta) {
        this.cantidadAleta = cantidadAleta;
    }

    @Override
    public void mover() {
        System.out.println("El pez está nadando..."); 
    }


    
    
}
