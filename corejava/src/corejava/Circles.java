package corejava;

public class Circles implements Shapes {

	private double radius;
	public Circles(double r){
		this.radius=r;
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public double getRadius(){
		return this.radius;
	}

}
