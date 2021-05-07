package kodlamaio_game_crm.Abstract;

import kodlamaio_game_crm.Entities.Game;
import kodlamaio_game_crm.Entities.Gamer;

public interface GamerSaleService extends BaseService {
	
	public boolean sale(Game game,Gamer gamer);

}
