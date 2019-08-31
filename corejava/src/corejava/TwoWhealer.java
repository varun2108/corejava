package corejava;
interface MotorBike{
	int speed=50;
	public void totalDistance();
}
interface Cycle{
	int distance=150;
	public void speed();
}
public class TwoWhealer implements MotorBike,Cycle {
	int totalDistance;
	int avgspeed;
	public void totalDistance(){
		totalDistance=speed*distance;
		System.out.println("Total Distance traveled");
	}
	public void speed(){
		int avgspeed=totalDistance/speed;
		System.out.println("Average Speed maintained : "+avgspeed);
	}
	public static void main(String[] args){
		TwoWhealer t1=new TwoWhealer();
		t1.totalDistance();
		t1.speed();
		
	}
}
