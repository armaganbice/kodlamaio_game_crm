package kodlamaio_game_crm;

import java.util.Date;
import java.util.Scanner;

import Adapter.MernisServiceAdapter;
import Utils.Utils;
import kodlamaio_game_crm.Abstract.CampaignSaleService;
import kodlamaio_game_crm.Abstract.CampaignService;
import kodlamaio_game_crm.Abstract.GameService;
import kodlamaio_game_crm.Abstract.GamerCheckService;
import kodlamaio_game_crm.Abstract.GamerSaleService;
import kodlamaio_game_crm.Abstract.GamerService;
import kodlamaio_game_crm.Abstract.SaleService;
import kodlamaio_game_crm.Concrete.CampaignManager;
import kodlamaio_game_crm.Concrete.CampaignSaleManager;
import kodlamaio_game_crm.Concrete.GameManager;
import kodlamaio_game_crm.Concrete.GamerManager;
import kodlamaio_game_crm.Concrete.GamerSaleManager;
import kodlamaio_game_crm.Concrete.SaleManager;
import kodlamaio_game_crm.Entities.Campaign;
import kodlamaio_game_crm.Entities.Game;
import kodlamaio_game_crm.Entities.Gamer;
import kodlamaio_game_crm.Entities.Sale;

public class Main {

	public static void main(String[] args) {
		// javaSE-1.8 versiyonunda yapýlmýþtýr. 
		boolean kosul=true;
		int menusecim=0;
		while (kosul==true)
		{
			Utils.MessageBox("------------------");
			Utils.MessageBox("KodlamaIo Game CRM");
			Utils.MessageBox("------------------");
	        Utils.MessageBox("Gamer Manager  1:");
	        Utils.MessageBox("Game  Manager  2:");
	        Utils.MessageBox("Sale  Manager  3:");
	        Utils.MessageBox("Campaign  Man. 4:");
	        Utils.MessageBox("GamerSale Man. 5:");
	        Utils.MessageBox("Campaigm Sale  6:");
	        Utils.MessageBox("          Exit 7:");
	        Utils.MessageBox("Select: ");
	        Scanner scan = new Scanner(System.in);
	        menusecim = scan.nextInt();
	        if (menusecim==7)
	        {
	           kosul=false;
	           break;
		    }
	        else
	        {
	        	switch (menusecim) {
	            case 1:
	            	gamerManagerTest();
	            	break;
	            case 2:
	            	gameManagerTest();
	            	break;
	            case 3:
	            	saleManagerTest();
	            	break;
	            case 4:
	            	campaignManagerTest();
	            	break;
	            case 5:
	            	gamerSaleManagerTest();
	            	break;
	            case 6:
	            	campaignSaleManagerTest();
	            	break;
	        	}
	        }
		}
	}

	
	private static void campaignSaleManagerTest()
	{
		Utils.MessageBox("Campaign Sale Manager");

	    //GamerCheckService gamerCheckService=new GamerCheckManager();
	    GamerCheckService gamerCheckService=new MernisServiceAdapter();

	    GamerService gamerService=new GamerManager(gamerCheckService);
	    GameService  gameService =new GameManager();
	    SaleService  saleService =new SaleManager();

	    CampaignSaleService campaignSaleService=new CampaignSaleManager(gamerService,gameService,saleService);
		
		Date date1 = Utils.getDate(1984, 7, 10);
		Gamer gamer1=new Gamer(1,"GÖKHAN","MUZÝKA",date1,"37165789624","gökhanmuzika@hotmail.com","123");
		Game  game1=new Game(1,"Need For Speed",500);
		
		Campaign campaign=new Campaign(1,1,500,date1,date1,true);
		campaign.setPrice(400);
		Utils.MessageBox("Sale result "+campaignSaleService.saleCampaign(gamer1, game1, campaign));
		
	}

	private static void gamerSaleManagerTest()
	{
		Utils.MessageBox("Gamer Sale Manager");

	    //GamerCheckService gamerCheckService=new GamerCheckManager();
	    GamerCheckService gamerCheckService=new MernisServiceAdapter();

	    GamerService gamerService=new GamerManager(gamerCheckService);
		SaleService saleService=new SaleManager();
		GamerSaleService gamerSaleService=new GamerSaleManager(gamerService,saleService);
		
		Date date1 = Utils.getDate(1984, 7, 10);
		Gamer gamer1=new Gamer(1,"GÖKHAN","MUZÝKA",date1,"37165789624","gökhanmuzika@hotmail.com","123");
		Game  game1=new Game(1,"Need For Speed",500);
		
		Utils.MessageBox("Sale result "+gamerSaleService.sale(game1, gamer1));
		
	}
	
	
	
	
	private static void gamerManagerTest() {
	    Utils.MessageBox("Gamer Manager");

	    //GamerCheckService gamerCheckService=new GamerCheckManager();
	    GamerCheckService gamerCheckService=new MernisServiceAdapter();
	    
		GamerService gamerService=new GamerManager(gamerCheckService);
		
		Date date1 = Utils.getDate(1984, 7, 10);
		Gamer gamer1=new Gamer(1,"GÖKHAN","MUZÝKA",date1,"37165789624","gökhanmuzika@hotmail.com","123");
		gamerService.add(gamer1);
		gamerService.update(gamer1);
		gamerService.delete(gamer1);
		Utils.MessageBox(gamerService.getById(1).getFirstName());
	    for(Gamer gamer : gamerService.getAll())
	    {
	    	Utils.MessageBox(gamer.getFirstName());
     	}
	}
	
    private static void gameManagerTest() {
    	Utils.MessageBox("Game Manager");
		GameService gameService=new GameManager();
		
		Date date1 = Utils.getDate(1967, 4, 21);
		Game game1=new Game(1,"Need For Speed",500);
		gameService.add(game1);
		gameService.update(game1);
		gameService.delete(game1);
		Utils.MessageBox(gameService.getById(1).getName());
	    for(Game game : gameService.getAll())
	    {
	    	Utils.MessageBox(game.getName());
     	}
	}
    
     private static void saleManagerTest() {
    	 Utils.MessageBox("Sale Manager");
		SaleService saleService=new SaleManager();
		Date date1 = Utils.getDate(1967, 4, 21);
		Sale sale1=new Sale(1,1,1,500,date1);
		saleService.add(sale1);
		saleService.update(sale1);
		saleService.delete(sale1);
	}
     
     private static void campaignManagerTest() {
    	 Utils.MessageBox("Campaign Manager");
 		CampaignService campaignService=new CampaignManager();
 		Date date1 = Utils.getDate(1967, 4, 21);
 		Campaign campaign1=new Campaign(1,1,500,date1,date1,true);
 		campaignService.add(campaign1);
 		campaignService.update(campaign1);
 		campaignService.delete(campaign1);
 	}

}
