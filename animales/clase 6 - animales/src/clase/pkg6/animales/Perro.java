
package clase.pkg6.animales;

public class Perro extends Mamifero{

    private String colorPelo;

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    
    public Perro(String colorPelo, boolean sangreCaliente, double peso) {
        super(sangreCaliente, peso);
        this.colorPelo = colorPelo;
    }
    
    @Override
    public void comer() {
        System.out.println("un perro comiendo");
    }
}
