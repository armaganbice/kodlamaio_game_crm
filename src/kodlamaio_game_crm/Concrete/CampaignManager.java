package kodlamaio_game_crm.Concrete;

import java.util.List;

import Utils.Utils;
import Utils.Constants.Messages;
import kodlamaio_game_crm.Abstract.CampaignService;
import kodlamaio_game_crm.Entities.Campaign;
import kodlamaio_game_crm.Entities.Sale;

public class CampaignManager implements CampaignService {

	public void add(Campaign campaign) {
	 	Utils.MessageBox(campaign.getId()+Messages.added);
	}

	@Override
	public void update(Campaign campaign) {
		Utils.MessageBox(campaign.getId()+Messages.updated);
	}

	@Override
	public void delete(Campaign campaign) {
		Utils.MessageBox(campaign.getId()+Messages.deleted);
	}

	@Override
	public Campaign getById(int id) {
		Utils.MessageBox(id+Messages.getById);
		return null;
	}
	

	@Override
	public List<Campaign> getAll() {
		Utils.MessageBox("Campaign"+Messages.getAll);
		return null;
	}

}
