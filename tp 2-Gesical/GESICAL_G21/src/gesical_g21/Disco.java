
package gesical_g21;
import java.util.ArrayList;
import java.util.List;

public class Disco {
    
    private int anioEdicion;
    private String titulo;
    private List<Cancion> canciones = new ArrayList();
    private Banda duenioBanda = null;
    private Solista duenioSolista = null;
    
//constructor
    public Disco(int anioEdicion, String titulo,List listaCanciones,Banda duenio) {
        this.anioEdicion = anioEdicion;
        this.titulo = titulo;
        this.duenioBanda = duenio;
        
        for(int i=0;i<listaCanciones.size();i++){
            canciones.add((Cancion) listaCanciones.get(i));
        }
    }
    
    public Disco(int anioEdicion, String titulo,List listaCanciones,Solista duenio) {
        this.anioEdicion = anioEdicion;
        this.titulo = titulo;
        this.duenioSolista = duenio;
        
        for(int i=0;i<listaCanciones.size();i++){
            canciones.add((Cancion) listaCanciones.get(i));
        }
    }
   
    public Disco() {
    }

    @Override
    public String toString() {
        
        String rta ="anioEdicion: " + anioEdicion + '\n' + 
                    "-Titulo: " + titulo + '\n' + 
                    "-Canciones: " + canciones + '\n' ;
                
        if(this.duenioBanda == null){
            rta += "-Duenio: " +  duenioSolista ;
        } else if(this.duenioSolista == null){
            rta += "-Duenio: " + duenioBanda + '\n' ;
        }
        
        return rta;
    }
    
    //getters y setters

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public Banda getDuenioBanda() {
        return duenioBanda;
    }

    public void setDuenioBanda(Banda duenioBanda) {
        this.duenioBanda = duenioBanda;
    }

    public Solista getDuenioSolista() {
        return duenioSolista;
    }

    public void setDuenioSolista(Solista duenioSolista) {
        this.duenioSolista = duenioSolista;
    }
    
    

    
    //otros metodos
    public int duracionTotal(){
        int total=0;
        
        for(int i=0 ;i<canciones.size();i++){
            total += (canciones.get(i)).getDuracion();
        }
        
        return total;
    }
    
    public String getMusico(){
        
        String rta="";
        
        if(this.duenioBanda == null){
            rta = duenioSolista.getNombre() + " " +duenioSolista.getApellido() ;
        } else if(this.duenioSolista == null){
            rta = duenioBanda.getTitulo();
        }
        
        return rta;
    }
    
    
    public String getGenero(){
        
        String rta="";
        
        if(this.duenioBanda == null){
            rta = duenioSolista.getGenero();
        } else if(this.duenioSolista == null){
            rta = duenioBanda.getGenero();
        }
        
        return rta;
    }
    
    public int getTamanioListaCanciones(){
        return canciones.size();
    }
    
    public Cancion getCanciones(int i){
        return canciones.get(i);
    }
    
    public String getNombreCancion(int i){
        return canciones.get(i).getNombre();
    }
    
    
}
