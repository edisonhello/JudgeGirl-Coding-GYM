package 菜單;

import java.util.Scanner;

public class Shop {
	private String name;
	private Food[] foods;
	public Shop()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入店家");
		this.name = scanner.nextLine();
		System.out.println("請輸入食物數量");
		foods = new Food[scanner.nextInt()];
		for(int i=0;i<foods.length;i++)
		{
			foods[i] = new Food();
		}
	}
	public String toString()
	{
		String temp = name + "\n";
		for(int i=0;i<foods.length;i++)
		{
			temp += (i+1) + foods[i].toString();
		}
		return temp;
	}
}
