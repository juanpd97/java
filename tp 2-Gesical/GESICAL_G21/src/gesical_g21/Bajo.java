
package gesical_g21;

public class Bajo extends Instrumento {
    
    private String nombre = "bajo";
    
       
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public void tocar(){
        System.out.println("tocando un bajo");
    }
}
