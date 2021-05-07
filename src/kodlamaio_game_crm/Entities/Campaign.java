package kodlamaio_game_crm.Entities;
import java.util.Date;
import kodlamaio_game_crm.Abstract.Entity;

public class Campaign implements Entity{

	private int id;
	private int gameId;
	private double price;
	private Date startDate;
	private Date finishDate;
    private boolean isActive;
    
    public Campaign()
    {
    	super();
    }

    public Campaign(int id, int gameId, double price, Date startDate, Date finishDate, boolean isActive) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.price = price;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.isActive = isActive;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
    
}
