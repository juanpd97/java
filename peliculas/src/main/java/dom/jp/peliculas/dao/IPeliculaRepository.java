package dom.jp.peliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dom.jp.peliculas.entities.Pelicula;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Long> {

}
