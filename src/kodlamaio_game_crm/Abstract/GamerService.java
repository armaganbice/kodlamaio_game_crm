package kodlamaio_game_crm.Abstract;

import java.util.List;

import kodlamaio_game_crm.Entities.Gamer;

public interface GamerService extends BaseService {

	public void add(Gamer gamer);
	public void update(Gamer gamer);
	public void delete(Gamer gamer);
	public Gamer getById(int id);
	public List<Gamer> getAll();
	
}
