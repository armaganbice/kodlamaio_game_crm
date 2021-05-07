package kodlamaio_game_crm.Abstract;

import java.util.List;

import kodlamaio_game_crm.Entities.Sale;

public interface SaleService extends BaseService{
	
	public void add(Sale sale);
	public void update(Sale game);
	public void delete(Sale game);
	public Sale getById(int id);
	public List<Sale> getAll();

}
