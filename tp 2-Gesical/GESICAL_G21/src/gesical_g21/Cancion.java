
package gesical_g21;

public class Cancion {
    
    private String nombre;
    private int duracion;
    
    
    //constructores
    
    public Cancion(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }
    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    
    
    @Override
    public String toString() {
        return  "-Nombre: " + nombre + '\n' 
               +"-Duracion: " + duracion + '\n';
    }
    
    
    
}
