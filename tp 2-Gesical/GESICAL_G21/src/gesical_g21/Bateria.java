
package gesical_g21;

public class Bateria extends Instrumento{
    
    
    private String nombre = "bateria";
    
       
    @Override
    public String getNombre(){
        return nombre;
    }
        @Override
    public void tocar(){
        System.out.println("tocando una bateria");
    }
}
