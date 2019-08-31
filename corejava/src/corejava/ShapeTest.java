package corejava;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes shape=new Circles(10);
		shape.draw();
		System.out.println("Area="+shape.getArea());
		shape=new Rectangles(10,10);
		shape.draw();
		System.out.println("Area="+shape.getArea());
	

	}

}
