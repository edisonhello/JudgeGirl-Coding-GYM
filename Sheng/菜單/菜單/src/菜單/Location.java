package 菜單;

import java.util.Scanner;

public class Location {
	private String name;
	private Shop[] shops;
	public Location()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入地點");
		this.name = scanner.nextLine();
		System.out.println("請輸入店家數量");
		this.shops = new Shop[scanner.nextInt()];
		for(int i=0;i<shops.length;i++)
		{
			shops[i] = new Shop();
		}
	}
	public String toString()
	{
		String temp = name + "\n";
		for(int i=0;i<shops.length;i++)
		{
			temp += (i+1) + shops[i].toString() + "\n";
		}
		return temp;
	}
}
