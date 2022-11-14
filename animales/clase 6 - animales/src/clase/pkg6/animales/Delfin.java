
package clase.pkg6.animales;


public class Delfin extends Mamifero{

    public Delfin(boolean sangreCaliente, double peso) {
        super(sangreCaliente, peso);
    }
    
    @Override
    public void comer() {
        System.out.println("un delfin comiendo"); }
    
    public void nadar(){
        System.out.println("un delfin nandando");
    }
}
