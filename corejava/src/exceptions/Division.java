package exceptions;
import java.util.*;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input two intergers");
		a=sc.nextInt();
		b=sc.nextInt();
		try{
			result=a/b;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception cought");
		}
		finally {
			sc.close();
			System.out.println("in finally block");
		}
		

	}

}
