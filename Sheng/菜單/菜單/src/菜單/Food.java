package ���;

import java.util.Scanner;

public class Food {
	private String name;
	public Food()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("��J����");
		this.name = scanner.nextLine();
	}
	public String toString()
	{
		return "����" + name + "\n";
	}
}
