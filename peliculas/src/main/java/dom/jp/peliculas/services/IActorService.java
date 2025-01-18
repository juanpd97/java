package dom.jp.peliculas.services;

import java.util.List;

import dom.jp.peliculas.entities.Actor;

public interface IActorService{

	//public void save(Actor actor);
	//public void deleteBtId(Long id);
	//public Actor findById(Long id);
	public List<Actor> findAll();
	List<Actor> findAllById(List<Long> ids);
	
}
