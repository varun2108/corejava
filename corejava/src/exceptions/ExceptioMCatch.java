package exceptions;

public class ExceptioMCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=0;
		int result=0;
		int arr[]=new int[5];
		try{
			arr[0]=0;
			arr[1]=1;
			arr[2]=2;
			arr[3]=3;
			arr[4]=4;
			//arr[5]=5;
			result=num1/num2;
			System.out.println("Result of Divission : "+result);
		}
		catch(ArithmeticException e){
			System.out.println("Err:Divided by Zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Err: Array out of bond");
		}

	}

}
