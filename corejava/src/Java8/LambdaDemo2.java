package Java8;

// block lamda expressions
@FunctionalInterface
interface myString{
	String myStringFuncton(String str);
}
public class LambdaDemo2 {
public static void main(String[] args)
{
	myString reverseStr=(str) ->{
		String result="";
		
		for(int i=str.length()-1;i>=0;i--)
			result+=str.charAt(i);
		return result;
	};
	
	System.out.println(reverseStr.myStringFuncton("Lamda Demo"));
}
}