
package liconex_g21;

public class CircuitoDePrueba {
     //------ atributos -----

    private double tiempo;
    private int nroDeFaltas;
    
    //----- getters y setters -----


    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public int getNroDeFaltas() {
        return nroDeFaltas;
    }

    public void setNroDeFaltas(int nroDeFaltas) {
        this.nroDeFaltas = nroDeFaltas;
    }
    
    // ----- constructor -----

    public CircuitoDePrueba( double tiempo, int nroDeFaltas) {
        
        this.tiempo = tiempo;
        this.nroDeFaltas = nroDeFaltas;
    }
    
    //------ metodos -----
}
