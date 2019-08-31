package collections;

import java.util.ArrayList;
import java.util.Collections;

public class MyBasicArayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("c++");
		al.add("Perl");
		al.add("php");
		System.out.println(al);
	
		System.out.println("element at index 1:" +al.get(1));
		System.out.println("does list contain Java? "+al.contains("Java"));
		
		al.add(2,"play");
		System.out.println(al);
		System.out.println("is array list empty"+al.isEmpty());
		System.out.println("index of perl is"+al.indexOf("Perl"));
		System.out.println("size of arrayList"+al.size());
		Collections.sort(al);
		System.out.println(al);
	}

}
