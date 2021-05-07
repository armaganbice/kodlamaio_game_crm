package kodlamaio_game_crm.Abstract;

import kodlamaio_game_crm.Entities.Gamer;

public interface GamerCheckService extends BaseService{
	public boolean checkIfRealPerson(Gamer gamer);
}
