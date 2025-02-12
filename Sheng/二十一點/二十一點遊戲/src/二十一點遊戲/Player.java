package 二十一點遊戲;

abstract public class Player {
	protected static final int limit=21;
	protected int cash;
	protected int winRound;
	protected String name;
	public Player(String name)
	{
		winRound=0;
		cash=0;
		this.name=name;
	}
	abstract boolean is_continue();
	void getCard(Card card) {
		cash += card.getRank();
	}
	public boolean is_range()
	{
		if(cash<=limit)
		{
			return true;//未超過
		}
		else
		{
			return false;
		}
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getLimit() {
		return limit;
	}
	public int getWinRound() {
		return winRound;
	}
	public void setWinRound(int winRound) {
		this.winRound = winRound;
	}
	
}
