package kodlamaio_game_crm.Concrete;

import java.util.ArrayList;
import java.util.List;

import Utils.Utils;
import Utils.Constants.Messages;
import kodlamaio_game_crm.Abstract.GamerService;
import kodlamaio_game_crm.Abstract.GamerCheckService;
import kodlamaio_game_crm.Entities.Gamer;

public class GamerManager implements GamerService 
{
	
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService)
	{
		this.gamerCheckService=gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer))
		{
	    	Utils.MessageBox("Gamer "+Messages.added);
		}
		else
		{
			Utils.MessageBox("Gamer is not"+Messages.added);
		}
    }

	@Override
	public void update(Gamer gamer) {
		Utils.MessageBox("Gamer "+Messages.updated);
	}

	@Override
	public void delete(Gamer gamer) {
		Utils.MessageBox("Gamer "+Messages.deleted);
	}

	@Override
	public Gamer getById(int id) {
		Utils.MessageBox(Messages.getById);
		Gamer gamer=new Gamer();
		return gamer;
	}

	@Override
	public List<Gamer> getAll() {
		Utils.MessageBox("Gamers"+Messages.getAll);
		Gamer gamer1=new Gamer();
		Gamer gamer2=new Gamer();
		List<Gamer> gamers=new ArrayList<Gamer>() ;
		gamers.add(gamer1);
		gamers.add(gamer2);
		return gamers;
	}
	

}
