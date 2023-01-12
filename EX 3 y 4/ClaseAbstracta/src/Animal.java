
public abstract class Animal {
    private int id;
    private int peso;
    private String nombre;
    private String nombreCientifico;
    private String grupoAlimenticio;
    
    public Animal() {
        this.id = id;
        this.peso = peso;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.grupoAlimenticio = grupoAlimenticio;
    }
    public Animal(int id, int peso, String nombre, String nombreCientifico, String grupoAlimenticio) {
        this.id = id;
        this.peso = peso;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.grupoAlimenticio = grupoAlimenticio;
    }

    public String getGrupoAlimenticio() {
        return grupoAlimenticio;
    }

    public void setGrupoAlimenticio(String grupoAlimenticio) {
        this.grupoAlimenticio = grupoAlimenticio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    
    // metodos customer
    public void mover()
    {
        System.out.println("El animal se mueve...");
    }
    
    public abstract void emitirSonido();
    public abstract void consumoComida();
}
