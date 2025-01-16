package dom.jp.peliculas.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actores")
public class Actor implements Serializable{
	
	private static final long serialVersionUID = 139373491312888138L;
	
	
	@Id
	@GeneratedValue (strategy =  GenerationType.IDENTITY)
	private long id;
	private String nombre;
	@Column(name = "url_imagen")
	private String urlImagen;

	//-----------------
	
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
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	
	
	
	
}
