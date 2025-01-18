package dom.jp.peliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dom.jp.peliculas.entities.Actor;

public interface IActoresRepository extends JpaRepository<Actor, Long>{

}
