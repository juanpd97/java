package dom.jp.peliculas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dom.jp.peliculas.entities.Pelicula;
import dom.jp.peliculas.services.ActorServiceImpl;
import dom.jp.peliculas.services.GeneroServicesImpl;
import dom.jp.peliculas.services.ServicePeliculaImpl;

@Controller
public class PeliculaController {

	private ServicePeliculaImpl peliculaService;
	private GeneroServicesImpl generoService;
	@Autowired
	private ActorServiceImpl actorService;

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
		modelo.addAttribute("actores", actorService.findAll());

		return "pelicula";
	}

	@GetMapping("pelicula/{id}")
	public String editar(@PathVariable(name = "id") Long id, Model modelo) {
		Pelicula pelicula = new Pelicula();

		modelo.addAttribute("generos", generoService.findAll());
		modelo.addAttribute("pelicula", pelicula);
		modelo.addAttribute("titulo", "editar pelicula");
		modelo.addAttribute("actores", actorService.findAll());

		return "pelicula";
	}

	/*
	@PostMapping("/pelicula")
	public String guardar(Pelicula pelicula, @ModelAttribute(name = "ids") String ids) {

		/*List<Long> longList = Arrays.stream(ids.split(","))
                            .map(Long::parseLong)
                            .collect(Collectors.toList());
		 
		List<Long> idActores = new ArrayList<>();
		for (String number : ids.split(",")) {
			idActores.add(Long.parseLong(number));
		}
		
		pelicula.setProtagonistas(actorService.findAllById(idActores));
		
		peliculaService.save(pelicula);
		
		return "redirect:index";
	}
	*/
	
	@PostMapping("/pelicula")
public String guardar(Pelicula pelicula, @ModelAttribute(name = "ids") String ids) {
    List<Long> idActores = new ArrayList<>();
    if (ids != null && !ids.trim().isEmpty()) {
        for (String number : ids.split(",")) {
            idActores.add(Long.parseLong(number));
        }
    }
    
    pelicula.setProtagonistas(actorService.findAllById(idActores));
    peliculaService.save(pelicula);
    
    return "redirect:index";
}
	
	@GetMapping({ "/", "index" })
	public String index() {
		return "index";
	}
}
