
package liconex_g21;

import java.time.LocalDate;


public class ExamenMoto extends Examen {
    
    // ----- atributos ------
    private CircuitoDePrueba c2;
    //-------------------------
    
    // ----- constructores -----
    
    public ExamenMoto(CircuitoDePrueba c2, LocalDate fecha, Persona p, CircuitoDePrueba c, Vehiculo v) {
        super(fecha, p, c, v);
        this.c2 = c2;
    }

    public ExamenMoto() {
    }
    //  -------------------------
    
    // ----- metodos -----

    @Override
    public String toString() {
        return "ExamenMoto{" + "c2=" + c2 + '}';
    }
    
    
}
