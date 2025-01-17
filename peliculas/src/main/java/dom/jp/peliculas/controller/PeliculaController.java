package dom.jp.peliculas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dom.jp.peliculas.entities.Pelicula;
import dom.jp.peliculas.services.ServicePeliculaImpl;

@Controller
public class PeliculaController {

	
	private ServicePeliculaImpl peliculaService;
	
	public PeliculaController(ServicePeliculaImpl peliculaService) {
		this.peliculaService = peliculaService;
	}
	
	/*
	@PostMapping("pelicula")
	public Long guardar(@RequestParam String nombre, Date fechaEstreno,Genero genero,List<Actor> listaActores) {
		Pelicula pelicula = new Pelicula();
	
		pelicula.setFechaEstrno(fechaEstreno);
		pelicula.setGenero(genero);
		pelicula.setNombre(nombre);
		pelicula.setProtagonistas(listaActores);
		
		return pelicula.getId();
	}
	*/
	
	@GetMapping("pelicula")
	public String Guardar(Model modelo) {
		Pelicula pelicula = new Pelicula();
		modelo.addAttribute("pelicula", pelicula);
		modelo.addAttribute("titulo", "nueva pelicula");
		
		return "pelicula";
	}
	
	@GetMapping("pelicula/{id}")
	public String editar(@PathVariable(name="id") Long id, Model modelo) {
		Pelicula pelicula = new Pelicula();
		
		modelo.addAttribute("pelicula", pelicula);
		modelo.addAttribute("titulo", "editar pelicula");
		
		
		return "pelicula";
	}
	
	
}
