
package liconex_g21;
import java.time.LocalDate;
public class Persona {
    //----------atributos------------
    
    private int dni;
    private LocalDate fecha_nacimiento;
    private String nombre;
    private String apellido;

    
    //----------getters y setters------------
    
        public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

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
    // -----contructor-----
    public Persona(){
    }
    
    public Persona(int dni, LocalDate fecha_nacimiento, String nombre, String apellido) {
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //----------metodos------------

    
    
}
