
public class Principal {
    public static void main(String[] args) {
        Animal a = new Animal();        
        a.mover();
        
        Pez p = new Pez();
        p.mover();
        
        Animal a1 = new Pez();
        a1.mover();
        Animal a2 = new Ave();
        a2.mover();
        
        Ave ave = (Ave)a2;
        ave.comer();
    }
}
