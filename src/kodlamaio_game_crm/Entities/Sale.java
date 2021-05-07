package kodlamaio_game_crm.Entities;
import java.util.Date;
import kodlamaio_game_crm.Abstract.Entity;

public class Sale implements Entity {
	private int id;
	private int gamerId;
	private int gameId;
	private double price;
	private Date salesDate;
	
	public Sale() {
		super();
	}

	public Sale(int id, int gamerId, int gameId, double price, Date salesDate) {
		super();
		this.id = id;
		this.gamerId = gamerId;
		this.gameId = gameId;
		this.price = price;
		this.salesDate = salesDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

}
