
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
    
    // -----getters y setters -----
    
        public CircuitoDePrueba getC2() {
        return c2;
    }

    public void setC2(CircuitoDePrueba c2) {
        this.c2 = c2;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    public CircuitoDePrueba getC() {
        return c;
    }

    public void setC(CircuitoDePrueba c) {
        this.c = c;
    }

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }
    
    // ----------------------------


    
}
