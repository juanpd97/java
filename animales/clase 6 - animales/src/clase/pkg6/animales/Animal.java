
package clase.pkg6.animales;

public abstract class Animal {
    
    protected double peso;
    
    public Animal(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public abstract void comer();
    
}
