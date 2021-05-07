package kodlamaio_game_crm.Abstract;

import java.util.List;

import kodlamaio_game_crm.Entities.Game;


public interface GameService extends BaseService {

	public void add(Game game);
	public void update(Game game);
	public void delete(Game game);
	public Game getById(int id);
	public List<Game> getAll();
}
