package collections;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> mapcountry=new HashMap<>();
		mapcountry.put("1", "USA");
		mapcountry.put("33", "France");
		mapcountry.put("99", "india");
		Set<String> setcodes=mapcountry.keySet();
		Iterator<String> iterator=setcodes.iterator();
		
		System.out.println(setcodes);
		while(iterator.hasNext()){
			String code=iterator.next();
			System.out.println(code+"=>"+mapcountry.get(code));
		}
		System.out.println(mapcountry.get("99"));

	}

}
