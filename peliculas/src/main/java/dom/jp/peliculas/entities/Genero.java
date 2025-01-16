package dom.jp.peliculas.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "generos")
public class Genero implements Serializable{
	private static final long serialVersionUID = 7076275481815969814L;

	@Id
	@GeneratedValue (strategy =  GenerationType.IDENTITY)
	private long id;
	private String nombre;
	
	
	
	// -----------------------
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
