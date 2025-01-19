package dom.jp.peliculas.services;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dom.jp.peliculas.entities.Actor;
import dom.jp.peliculas.entities.Pelicula;
import dom.jp.peliculas.dao.IPeliculaRepository;

@Service
public class ServicePeliculaImpl implements IServicioPelicula{

	@Autowired
	private IPeliculaRepository peliculaRepository;
	
	
	@Override
	public void save(Pelicula pelicula) {
		peliculaRepository.save(pelicula);
		
	}

	@Override
	public Pelicula findById(Long id) {
		
		return peliculaRepository.findById(id).orElse(null);
	}

	@Override
	public List<Pelicula> findAll() {
		return (List<Pelicula>) peliculaRepository.findAll();
	}

	@Override
	public void delete(Long Id) {
		peliculaRepository.deleteById(Id);
	}

	@Override
	public List<Actor> findAllActores(Long id) {
		Pelicula pelicula = peliculaRepository.findById(id).orElse(null);
		
		if(pelicula == null) {
			return null;
		}
			
		return pelicula.getProtagonistas();
		
		
	}


}
