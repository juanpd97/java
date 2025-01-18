package dom.jp.peliculas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dom.jp.peliculas.entities.Pelicula;
import dom.jp.peliculas.services.GeneroServicesImpl;
import dom.jp.peliculas.services.ServicePeliculaImpl;

@Controller
public class PeliculaController {

	private ServicePeliculaImpl peliculaService;
	private GeneroServicesImpl generoService;

	public PeliculaController(ServicePeliculaImpl peliculaService, GeneroServicesImpl generoService) {
		this.peliculaService = peliculaService;
		this.generoService = generoService;
	}

	@GetMapping("pelicula")
	public String crear(Model modelo) {
		Pelicula pelicula = new Pelicula();
		modelo.addAttribute("pelicula", pelicula);
		modelo.addAttribute("titulo", "nueva pelicula");
		modelo.addAttribute("generos", generoService.findAll());

		return "pelicula";
	}

	@GetMapping("pelicula/{id}")
	public String editar(@PathVariable(name = "id") Long id, Model modelo) {
		Pelicula pelicula = new Pelicula();

		modelo.addAttribute("generos", generoService.findAll());
		modelo.addAttribute("pelicula", pelicula);
		modelo.addAttribute("titulo", "editar pelicula");

		return "pelicula";
	}

	@PostMapping("/pelicula")
	public String guardar(Pelicula pelicula) {
		peliculaService.save(pelicula);
		return "redirect:index";
	}
	
	@GetMapping({"/", "index"})
	public String index() {
		
		return "index";
	}
}
