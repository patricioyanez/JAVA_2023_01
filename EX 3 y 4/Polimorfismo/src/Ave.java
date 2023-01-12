
public class Ave extends Animal{
    private boolean tieneBuche;

    public Ave() {
        super();
        this.tieneBuche = false;
    }
    
    public Ave(boolean tieneBuche, int id, int peso, String nombre, String nombreCientifico, String grupoAlimenticio) {
        super(id, peso, nombre, nombreCientifico, grupoAlimenticio);
        this.tieneBuche = tieneBuche;
    }

    public boolean isTieneBuche() {
        return tieneBuche;
    }

    public void setTieneBuche(boolean tieneBuche) {
        this.tieneBuche = tieneBuche;
    }

    @Override
    public void mover() {
        System.out.println("El ave vuela");
    }
    
    public void comer()
    {
        System.out.println("Semillas, plantas, pajaros");
    }
    
}
