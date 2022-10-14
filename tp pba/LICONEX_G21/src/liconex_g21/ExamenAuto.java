
package liconex_g21;

import java.time.LocalDate;

public class ExamenAuto extends Examen{

    
    // ----- constructor -----
    public ExamenAuto(LocalDate fecha, Persona p, CircuitoDePrueba c, Vehiculo v) {
        super(fecha, p, c, v);
    }
    
        public ExamenAuto() {
    }

    // ------------------------
    
    // ----- metodos -----

    @Override
    public String toString() {
        return "Examen{" + "fecha=" + fecha + ", p=" + p + ", c=" + c + ", v=" + v + '}';
    }

     

    
}
