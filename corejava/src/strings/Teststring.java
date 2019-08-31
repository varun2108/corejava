package strings;

public class Teststring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("Hello");
		String s2=new String("Hello");
		
		String str1="hello";
		String str2="hello";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.endsWith("o"));
	}

}
