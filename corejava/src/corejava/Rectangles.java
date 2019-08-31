package corejava;

public class Rectangles implements Shapes {
	private double width;
	private double height;
	public Rectangles(double w,double h){
		this.width=w;
		this.height=h;
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

}
