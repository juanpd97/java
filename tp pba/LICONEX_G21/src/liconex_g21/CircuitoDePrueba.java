
package liconex_g21;

public class CircuitoDePrueba {
     //------ atributos -----
    private int nroDeVueltas;
    private double tiempo;
    private int nroDeFaltas;
    
    //----- getters y setters -----

    public int getNroDeVueltas() {
        return nroDeVueltas;
    }

    public void setNroDeVueltas(int nroDeVueltas) {
        this.nroDeVueltas = nroDeVueltas;
    }

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

    public CircuitoDePrueba(int nroDeVueltas, double tiempo, int nroDeFaltas) {
        this.nroDeVueltas = nroDeVueltas;
        this.tiempo = tiempo;
        this.nroDeFaltas = nroDeFaltas;
    }
    
    //------ metodos -----
}
