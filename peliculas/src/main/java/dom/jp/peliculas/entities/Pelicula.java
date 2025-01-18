package dom.jp.peliculas.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "peliculas")
public class Pelicula implements Serializable {
	private static final long serialVersionUID = -1793353317997661868L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nombre;
	@Column(name = "fecha_estreno")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaEstrno;
	@OneToOne
	private Genero genero;
	@ManyToMany
	private List<Actor> protagonistas;

	// ----------------------

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

	public Date getFechaEstrno() {
		return fechaEstrno;
	}

	public void setFechaEstrno(Date fechaEstrno) {
		this.fechaEstrno = fechaEstrno;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public List<Actor> getProtagonistas() {
		return protagonistas;
	}

	public void setProtagonistas(List<Actor> protagonistas) {
		this.protagonistas = protagonistas;
	}

}
