package kodlamaio_game_crm.Concrete;

import java.util.ArrayList;
import java.util.List;

import Utils.Utils;
import Utils.Constants.Messages;
import kodlamaio_game_crm.Abstract.GameService;
import kodlamaio_game_crm.Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		Utils.MessageBox(game.getName()+Messages.added);
	}

	@Override
	public void update(Game game) {
		Utils.MessageBox(game.getName()+Messages.updated);
	}

	@Override
	public void delete(Game game) {
		Utils.MessageBox(game.getName()+Messages.deleted);
	}

	@Override
	public Game getById(int id) {
		Utils.MessageBox(Messages.getById);
		Game game=new Game();
		return game;
	}

	@Override
	public List<Game> getAll() {
		Utils.MessageBox("Games"+Messages.getAll);
		Game game1=new Game();
		Game game2=new Game();
		List<Game> games=new ArrayList<Game>() ;
		games.add(game1);
		games.add(game2);
		return games;
	}
}
