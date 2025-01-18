package dom.jp.peliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dom.jp.peliculas.dao.IActoresRepository;
import dom.jp.peliculas.entities.Actor;

@Service
public class ActorServiceImpl implements IActorService {

	@Autowired
	private IActoresRepository repo; 
	
	/*
	@Override
	@PostMapping("actor")
	public void save(@PathVariable Actor actor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBtId(Long id) {
		// TODO Auto-generated method stub
		
	}
	 
	 
	
	@Override
	public Actor findById(Long id) {
		return repo.findById(id).orElse(null);
	}
	*/

	@Override
	public List<Actor> findAll() {
		return (List<Actor>)repo.findAll();
	}

	@Override
	public List<Actor> findAllById(List<Long> ids) {
		return (List<Actor>)repo.findAllById(ids);
	}

}
















