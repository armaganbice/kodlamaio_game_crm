package kodlamaio_game_crm.Concrete;

import java.util.Date;

import kodlamaio_game_crm.Abstract.CampaignSaleService;
import kodlamaio_game_crm.Abstract.CampaignService;
import kodlamaio_game_crm.Abstract.GameService;
import kodlamaio_game_crm.Abstract.GamerService;
import kodlamaio_game_crm.Abstract.SaleService;
import kodlamaio_game_crm.Entities.Campaign;
import kodlamaio_game_crm.Entities.Game;
import kodlamaio_game_crm.Entities.Gamer;
import kodlamaio_game_crm.Entities.Sale;

public class CampaignSaleManager implements CampaignSaleService {

	GamerService gamerService;
	GameService gameService;
	SaleService saleService;
	
	public CampaignSaleManager(GamerService gamerService,GameService gameService,SaleService saleService)
	{
		this.gamerService=gamerService;
		this.gameService=gameService;
		this.saleService=saleService;
	}
	
	@Override
	public boolean saleCampaign(Gamer gamer, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		Date salesDate = new Date();
		Sale sale=new Sale(0,gamer.getId(),game.getId(),campaign.getPrice(),salesDate);
		saleService.add(sale);
		return true;
	}
	

}
