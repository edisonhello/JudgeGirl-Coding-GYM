package member.nyngwang.area;

public abstract class Shape {
	protected double area;
	
	public double getArea() {
		return area;
	}
	
	protected abstract void onAreaChange();
}
