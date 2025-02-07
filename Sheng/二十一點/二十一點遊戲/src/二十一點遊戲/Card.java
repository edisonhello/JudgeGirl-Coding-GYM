package 二十一點遊戲;

public class Card implements Poker{
	private static String[] suits={"花色","梅花","方塊","紅心","黑桃"};
	private static String[] ranks={"點數","Ace","二","三","四","五","六","七","八","九","十","J","Q","K"};
	private int suit;
	private int rank;
	public Card(int suit,int rank)//(花色，大小)
	{
		this.suit=suit;
		this.rank=rank;
	}
	@Override
	public String print()
	{
		return suits[suit]+ranks[rank];
	}
	public Card compare(Card card)//傳回比較大的
	{
		if(this.rank>card.getRank())
		{
			return this;
		}
		else if(this.rank<card.getRank())
		{
			return card;
		}
		else
		{
			if(this.suit>card.getSuit())
			{
				return this;
			}
			else if(this.suit<card.getSuit())
			{
				return card;
			}
		}
		return null;//兩張一樣
	}
	public static String[] getSuits() {
		return suits;
	}
	public static void setSuits(String[] suits) {
		Card.suits = suits;
	}
	public static String[] getRanks() {
		return ranks;
	}
	public static void setRanks(String[] ranks) {
		Card.ranks = ranks;
	}
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

}
