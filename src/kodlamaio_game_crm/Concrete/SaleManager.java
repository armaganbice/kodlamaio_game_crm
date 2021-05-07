package kodlamaio_game_crm.Concrete;

import java.util.List;

import Utils.Utils;
import Utils.Constants.Messages;
import kodlamaio_game_crm.Abstract.SaleService;
import kodlamaio_game_crm.Entities.Sale;

public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale) {
	 	Utils.MessageBox(sale.getId()+Messages.added);
	}

	@Override
	public void update(Sale sale) {
		Utils.MessageBox(sale.getId()+Messages.updated);
	}

	@Override
	public void delete(Sale sale) {
		Utils.MessageBox(sale.getId()+Messages.deleted);
	}

	@Override
	public Sale getById(int id) {
		Utils.MessageBox(id+Messages.getById);
		return null;
	}
	

	@Override
	public List<Sale> getAll() {
		Utils.MessageBox(id+Messages.getAll);
		return null;
	}

}
