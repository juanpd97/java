
package liconex_g21;


public abstract class Vehiculo {
    
    //------ atributos -----
    protected String patente;
    protected String marca;
    protected int cilindrada;
    
    // ------ getters y setters-----}

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    // ----- constructor -----

    public Vehiculo(String patente, String marca, int cilindrada) {
        this.patente = patente;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }
    
    // ----- metodos -----
    
}
