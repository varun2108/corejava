package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Details {
	public static void main(String[] args){
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		tmap.put(1, "Data1");
		tmap.put(23,"Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");
		
		Set set=tmap.entrySet();
		System.out.println(set);
		Iterator iterator=set.iterator();
		while(iterator.hasNext()){
			Map.Entry mentry=(Map.Entry)iterator.next();
		System.out.println("key is:"+mentry.getKey()+"&Value is :");
		System.out.println(mentry.getValue());
		}
		
}
}