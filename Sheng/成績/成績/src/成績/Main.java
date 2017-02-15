package 成績;

public class Main {
	public static void main(String argv[])
	{
		Source english = new Source("英文",50,60,70,80,new EnglishCalculate());
		english.sumSource();
		english.display();
		Source chinese = new Source("國文",90,80,70,60,new ChineseCalculate());
		chinese.sumSource();
		chinese.display();
		Source code = new Source("程式",78,88,95,75,new CodeCalculate());
		code.sumSource();
		code.display();
	}
}
