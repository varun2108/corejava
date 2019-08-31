package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import java.util.*;
public class TestArryayList21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> al=new ArrayList<String>();
		al.add("jim");
		al.add("Michel");
		al.add("James");
		al.add("Andy");
		
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
