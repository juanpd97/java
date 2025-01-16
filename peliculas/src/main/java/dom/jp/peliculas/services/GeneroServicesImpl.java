package dom.jp.peliculas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dom.jp.peliculas.dao.IGeneroRepository;
import dom.jp.peliculas.entities.Genero;

@Service
public class GeneroServicesImpl implements IGeneroService {

	// tambien se puede usar @Autowired
	private IGeneroRepository generoRepository;

	public GeneroServicesImpl(IGeneroRepository generoRepository) {
		this.generoRepository = generoRepository;
		;
	}

	@Override
	public void save(Genero genero) {
		generoRepository.save(genero);

	}

	@Override
	public Genero getById(Long id) {
		Genero genero = generoRepository.findById(id).orElse(null);
		return genero;
	}

	@Override
	public void delete(Long id) {
		generoRepository.deleteById(id);

	}

	@Override
	public List<Genero> findAll() {
		List<Genero> listaGen= (List<Genero>) generoRepository.findAll();
		return listaGen;
	}

}
