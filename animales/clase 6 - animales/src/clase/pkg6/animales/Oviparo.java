
package clase.pkg6.animales;

public class Oviparo extends Animal {
    private boolean vuela;
    
    public Oviparo(boolean vuela,double peso){
        super(peso);
        this.vuela = vuela;
    }

    @Override
    public void comer() {
        System.out.println("un oviparo comiendo");
    }
    
    
}
