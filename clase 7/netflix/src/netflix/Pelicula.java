
package netflix;

public class Pelicula extends Video {

    private int anio;

    public Pelicula(int anio, String titulo, String genero, int duracion) {
        super(titulo, genero, duracion);
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    @Override
    public void mayorDuracion() {
        super.mayorDuracion(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
