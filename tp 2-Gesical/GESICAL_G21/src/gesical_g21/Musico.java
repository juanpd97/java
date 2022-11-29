
package gesical_g21;

public class Musico {
    
    protected String genero;
    protected int anio;
    protected String discografia;

    //constructor
    public Musico(String genero, int anio, String discografia) {
        this.genero = genero;
        this.anio = anio;
        this.discografia = discografia;
    }
    
    //getters y setters

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }
    
    
    
}
