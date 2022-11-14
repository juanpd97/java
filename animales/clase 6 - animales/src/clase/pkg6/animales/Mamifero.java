
package clase.pkg6.animales;

public abstract class Mamifero extends Animal {

    protected boolean sangreCaliente;

    public Mamifero(boolean sangreCaliente, double peso) {
        super(peso);
        this.sangreCaliente = sangreCaliente;
    }
    
    
}
