package liconex_g21;

import java.time.LocalDate;

public abstract class Examen {
    
    // ----- atributos -----
    protected LocalDate fecha;
    protected Persona p;
    protected CircuitoDePrueba c;
    protected Vehiculo v;
    
    // ----- getters y setters -----

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
        public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    //----- constructor -----
        public Examen(){
        }
    
        public Examen(LocalDate fecha, Persona p, CircuitoDePrueba c, Vehiculo v) {
        this.fecha = fecha;
        this.p = p;
        this.c = c;
        this.v = v;
    }
        
    // ----- metodos -----

    @Override
    public String toString() {
        return "Examen{" + "fecha=" + fecha + ", p=" + p + ", c=" + c + ", v=" + v + '}';
    }
        


        

    
    
        protected CircuitoDePrueba c2;
        public CircuitoDePrueba getC2() {
        return c2;
        }
}
