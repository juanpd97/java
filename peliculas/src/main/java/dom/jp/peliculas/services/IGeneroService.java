package dom.jp.peliculas.services;

import java.util.List;

//import dom.jp.peliculas.dao.IGeneroRepository;
import dom.jp.peliculas.entities.Genero;

public interface IGeneroService {
	

	public void save(Genero genero);
	public Genero getById(Long id);
	public void delete(Long id);
	public List<Genero> findAll();
	
	
}
