
package password;


public class Password {
    // atributos
    private int longitud;
    private String texto;
    //constructore

    public Password() {
    longitud = 0;
    texto = "";
    }

    public Password(String texto) {
        this.texto = texto;
        this.longitud = this.texto.length();
    }

    // getters y setters
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
        this.longitud = this.texto.length();
    }

    public int getLongitud() {
        return longitud;
    }
    
    // metodos
    public boolean esFuerte(){
        int contadorMay = 0;
        int contadorMin = 0;
        int contadorNum = 0;
        for(int i = 0; i< this.longitud ; i++){
            if(this.texto.charAt(i) >= 'A' && this.texto.charAt(i) <= 'z'){
                contadorMay ++;
            } else if(this.texto.charAt(i) >= 'a' && this.texto.charAt(i) <= 'z'){
                contadorMin ++;
            } else if(this.texto.charAt(i) >= '0' && this.texto.charAt(i) <= '9'){
                contadorNum ++;
            }
        }
        if(contadorMay>2 && contadorMin > 1 && contadorNum >5){
           return true; 
        } else{
        return false;}
    }
        
}
