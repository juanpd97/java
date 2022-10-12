
package liconex_g21;

public class Moto extends Vehiculo {
    //----- atributos -----
    private boolean espejos;
    
    //----- getters y setters -----

    public boolean isEspejos() {
        return espejos;
    }

    public void setEspejos(boolean espejos) {
        this.espejos = espejos;
    }
    
    // ----- constructor -----
    
  

    public Moto(boolean espejos, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.espejos = espejos;
    }
     //----- metodos -----
}
