
package liconex_g21;

public class Auto extends Vehiculo {
    
    //----- atributos -----
    private int CantidadDePuertas;
    
    //----- getters y setters -----

    public int getCantidadDePuertas() {
        return CantidadDePuertas;
    }

    public void setCantidadDePuertas(int CantidadDePuertas) {
        this.CantidadDePuertas = CantidadDePuertas;
    }
    //----- constructors ------

    public Auto(int CantidadDePuertas, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.CantidadDePuertas = CantidadDePuertas;
    }
    
    // ----- metodos -----
}
