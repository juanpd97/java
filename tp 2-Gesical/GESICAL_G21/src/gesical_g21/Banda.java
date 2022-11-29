
package gesical_g21;

import java.util.ArrayList;
import java.util.List;

public class Banda extends Musico{
    
    private String titulo;
    private List <Solista> lista_solistas = new ArrayList();

    

    //constructor
        public Banda(String titulo, String genero, int anio, String discografia,List listaSolistas) {
        super(genero, anio, discografia);
        this.titulo = titulo;
        
        for(int i=0 ;i<listaSolistas.size() ;i++){
            lista_solistas.add((Solista) listaSolistas.get(i));
        }
    }
    //getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Solista> getLista_solistas() {
        return lista_solistas;
    }

    public void setLista_solistas(List<Solista> lista_solistas) {
        this.lista_solistas = lista_solistas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    @Override
    public String toString() {
        
        String x = "";
        for(int i=0 ; i<lista_solistas.size() ; i++){
            x += "-integrante " + (i+1) +'\n'+ lista_solistas.get(i).toString() + '\n';
        }
        
        return "-Titulo:" + this.titulo + '\n'
               +"-Genero:" + this.genero + '\n'
               +"-Año:" + this.anio + '\n'
                +"-Discografia:" + this.discografia + '\n'
                +"-Integrantes:" + '\n'
                + x;
    }



   

    

    
    
    
    
}
