package kodlamaio_game_crm.Abstract;

import java.util.List;

import kodlamaio_game_crm.Entities.Campaign;

public interface CampaignService {

	public void add(Campaign campaign);
	public void update(Campaign campaign);
	public void delete(Campaign campaign);
	public Campaign getById(int id);
	public List<Campaign> getAll();

}
