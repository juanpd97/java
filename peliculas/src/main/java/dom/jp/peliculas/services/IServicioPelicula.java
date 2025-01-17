package dom.jp.peliculas.services;

import java.util.List;

import dom.jp.peliculas.entities.Pelicula;


public interface IServicioPelicula {

	public void save(Pelicula pelicula);
	public Pelicula findById(Long id);
	public List<Pelicula> findAll();
	public void delete(Long Id);
	
}
