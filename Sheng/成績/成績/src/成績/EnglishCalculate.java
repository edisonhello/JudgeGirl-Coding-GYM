package ���Z;

public class EnglishCalculate implements Calculate{
	@Override
	public double sumSource(double attendSource, double workSource, double midExamSource, double finalExamSource) {
		return (attendSource*0.4 + workSource*0.6)*0.3 + midExamSource*0.3 + finalExamSource*0.4;
	}
	
}
