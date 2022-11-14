
package netflix;

public class Serie extends Video{
    
    private int temporadas;

    public Serie(int temporadas, String titulo, String genero, int duracion) {
        super(titulo, genero, duracion);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
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
