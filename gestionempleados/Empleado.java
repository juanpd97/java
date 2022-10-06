package unidad1.gestionempleados;

public class Empleado {

    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    //Constructores 
    public Empleado() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.salario = 0;
    }

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 0;
        this.salario = 0;
    }

    //Métodos públicos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Resto de getters y setters

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String mensaje = "El empleado se llama " + this.nombre + " " + apellido
                + " con " + edad + " años y un salario de " + salario;
        return mensaje;
    }
    
    /*Suma un plus al salario del empleado si el empleado tiene 40 años o más*/
    public void plus (double sueldoPlus){
        if (edad >= 40){
            salario += sueldoPlus;
        }
    }
}
