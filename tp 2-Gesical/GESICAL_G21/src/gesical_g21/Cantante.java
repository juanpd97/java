
package gesical_g21;
public class Cantante extends Instrumento{

    public Cantante() {
    }
    
    private String nombre = "cantante";
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    
    @Override
    public void tocar(){
        System.out.println("cantando");
    }
}
