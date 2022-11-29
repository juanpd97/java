
package gesical_g21;

public class Solista extends Musico{
    
    private String nombre;
    private String apellido;
    private String nacionalidad;
    //private boolean tocaInstrumento;
    private Instrumento instrument;

    //constructor

    public Solista(String nombre, String apellido, String nacionalidad, Instrumento instrument, String genero, int anio, String discografia) {
        super(genero, anio, discografia);
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.instrument = instrument;
    }

    
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

   /* public boolean isTocaInstrumento() {
        return tocaInstrumento;
    }

   public void setTocaInstrumento(boolean tocaInstrumento) {
        this.tocaInstrumento = tocaInstrumento;
    }
    */
    public Instrumento getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrumento instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        
        String rta = "";
        
        rta = "-Nombre: " + this.nombre + '\n' 
             +"-Apellido: " + this.apellido + '\n'
             +"-Nacionalidad: " + this.nacionalidad + '\n'
             +"-Instrumento: " + this.instrument.getNombre() + '\n'   ;
        
        return rta;
    }
    
    
    
}
