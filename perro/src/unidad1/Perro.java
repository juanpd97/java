
package unidad1;

public class Perro {
    
    // atributos:
    private String raza;
    private int anioNac;
    private double peso;
    private String nombre;
    private boolean tieneChip;
    private boolean estaLastimado;
    private boolean adoptado;

    //constructor
    public Perro(String raza, int anioNac, double peso, String nombre, boolean tieneChip, boolean estaLastimado) {    
        this.raza = raza;
        this.anioNac = anioNac;
        this.peso = peso;
        this.nombre = nombre;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.adoptado = false;
    }

    //geters and seters:
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public boolean isEnAdopcion() {
        return adoptado;
    }

    public void setEnAdopcion(boolean enAdopcion) {
        this.adoptado = enAdopcion;
    }
     
    //metodos
    public int calcularEdad(){
        return (2022 - this.getAnioNac());
    }
    
    public boolean puedePerderse(){
        return !this.isTieneChip();
    }
    
    public boolean puedeAdoptarse(){
        if(! this.adoptado)
            if(this.getPeso() > 5 && !this.isEstaLastimado() )
                this.adoptado = true;
        
        return this.adoptado;
    }
}