package exceptions;

public class ThrowExample {
	static void checkEligibillity(int stuage, int stuweight){
		if(stuage<12 && stuweight<40){
			throw new ArithmeticException("student is not eligible for registration");
		}
		else {
			System.out.println("student entry is Valid!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Registration Process!!");
		checkEligibillity(13,41);
		System.out.println("Have a nice day..");

	}

}
