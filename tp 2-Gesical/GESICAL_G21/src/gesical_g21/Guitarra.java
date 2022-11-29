
package gesical_g21;

public class Guitarra extends Instrumento{
    
    
    private String nombre = "cantante";
    
    @Override
    public String getNombre(){
        return nombre;
    }
        @Override
    public void tocar(){
        System.out.println("tocando una guitarra");
    }
}
