package dom.jp.peliculas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dom.jp.peliculas.dao.IGeneroRepository;
import dom.jp.peliculas.entities.Genero;
import dom.jp.peliculas.services.IGeneroService;

@RestController
public class GeneroController {
	
	@Autowired
	private IGeneroService GeneroService;

	/*public GeneroController(IGeneroRepository generoRepository) {
		this.generoRepository = generoRepository;
	}*/

	@PostMapping("genero")
	public long guardar(@RequestParam String nombre) {
		Genero genero = new Genero();
		genero.setNombre(nombre);

		GeneroService.save(genero);

		return genero.getId();
	}

	@GetMapping("genero/{id}")
	public String buscar(@PathVariable(name = "id") long id) {
		Genero genero;

		genero = GeneroService.getById(id);

		return genero.getNombre();
	}

}
