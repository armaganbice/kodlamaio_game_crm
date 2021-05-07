package kodlamaio_game_crm.Concrete;

import java.util.Date;

import Utils.Utils;
import kodlamaio_game_crm.Abstract.GamerSaleService;
import kodlamaio_game_crm.Abstract.GamerService;
import kodlamaio_game_crm.Abstract.SaleService;
import kodlamaio_game_crm.Entities.Game;
import kodlamaio_game_crm.Entities.Gamer;
import kodlamaio_game_crm.Entities.Sale;

public class GamerSaleManager implements GamerSaleService{

	GamerService gamerService;
	SaleService saleService;
	
	public GamerSaleManager(GamerService gamerService,SaleService saleService)
	{
		this.gamerService=gamerService;
		this.saleService=saleService;
	}
	
	@Override
	public boolean sale(Game game, Gamer gamer) {

		Date salesDate = new Date();
		Sale sale=new Sale(0,gamer.getId(),game.getId(),game.getPrice(),salesDate);
		
		saleService.add(sale);
		return true;

	}
	

}
