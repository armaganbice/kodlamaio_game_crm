package kodlamaio_game_crm.Abstract;

import kodlamaio_game_crm.Entities.Campaign;
import kodlamaio_game_crm.Entities.Game;
import kodlamaio_game_crm.Entities.Gamer;
import kodlamaio_game_crm.Entities.Sale;

public interface CampaignSaleService extends BaseService {
	
	public boolean saleCampaign(Gamer gamer,Game game,Campaign campaign);

}
