package 二十一點遊戲;

import java.util.ArrayList;

public class Game {
	private ArrayList<Player> list;
	private Deck deck;
	private int humanAmount;
	private int comAmount;
	private int round;
	public Game(int humanAmount,int comAmount)
	{
		list = new ArrayList<Player>();
		deck = new Deck();
		this.humanAmount = humanAmount;
		this.comAmount = comAmount;
		round = 20;
		for(int i=1;i<=humanAmount;i++)
		{
			list.add(new HumanPlayer("玩家" + Integer.toString(i)));
		}
		for(int i=1;i<=comAmount;i++)
		{
			list.add(new ComPlayer("電腦" + Integer.toString(i)));
		}
		for(int i=0;i<list.size();i++)
		{
			int ran = (int)(Math.random()*list.size());
			Player temp = list.get(i);
			list.set(i, list.get(ran));
			list.set(ran, temp);
		}
		System.out.print("順序為:");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i).getName() + "->");
		}
		System.out.println("");
	}
	public void run()
	{
		System.out.println("-----------遊戲開始----------");
		deck.Shuffle();
		for(int i=0;i<round;i++)
		{
			for(int j=0;j<list.size();j++)
			{
				System.out.println("");
				System.out.println("輪到" + list.get(j).getName());
				while(list.get(j).is_continue())
				{
					System.out.println("");
					if(deck.is_empty())
					{
						System.out.println("沒牌了，洗牌中...");
						deck = new Deck();//初始化
						deck.Shuffle();
					}
					Card nowCard = deck.pop();
					list.get(j).getCard(nowCard);
					System.out.println("是" + nowCard.print() + "!!!");
					System.out.println("目前" + list.get(j).getCash() + "點");
					if(!list.get(j).is_range())
					{
						list.get(j).setCash(0);
						System.out.println("爆掉了得0分...");
						break;
					}
				}
			}
			System.out.println("");
			int winner=0;
			for(int j=0;j<list.size();j++)
			{
				int max=0;
				System.out.println(list.get(j).getName() + "得到了" + list.get(j).getCash() + "分");
				if(list.get(j).getCash()>max)
				{
					winner=j;
					max=list.get(j).getCash();
				}
				list.get(j).setCash(0);//歸零
			}
			list.get(winner).setWinRound(list.get(winner).getWinRound()+1);
			System.out.println("");
			System.out.println(list.get(winner).getName() + "贏了這回合");
		}
		System.out.println("");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getName() + "贏了" + list.get(i).getWinRound() + "回合");
		} 
	}
}
