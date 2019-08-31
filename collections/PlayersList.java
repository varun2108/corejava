package collections;
import java.util.*;
public class PlayersList {
	ArrayList playerarray;
	List subListObj;
	PlayersList(){
		playerarray=new ArrayList();
		subListObj=new ArrayList();
	}
	void add(){
		for(int ctr=0;ctr<5;ctr++){
			playerarray.add(new Integer(ctr));
		}
		playerarray.add("Martina");
		playerarray.add("Serena");
		playerarray.add("Venus");
		playerarray.add("Serena");
		System.out.println();
	}
	void display(){
		System.out.println("****************************************");
		System.out.println("Retrive objects from ArrayList");
		System.out.println("*****************************************");
		System.out.println();
		for(int ctr=0;ctr<playerarray.size();ctr++){
			System.out.println(" "+playerarray.get(ctr));
		}
	}
	void search(){
		System.out.println();
		System.out.println("****************************************");
		System.out.println("Search for an object and return"+"the first and last postion");
		System.out.println("****************************************");
		System.out.println();
		System.out.println("first occurence of the string"+"\"serena\" is at postion "+playerarray.indexOf("Serena"));
		System.out.println("Last occurence of the string"+"\"serena\" is at postion "+playerarray.lastIndexOf("Serena"));
		System.out.println();

	}
	void extract(){
		System.out.println("****************************************");
		System.out.println(" Extract a sublist and then print the new List");
		System.out.println("****************************************");
		System.out.println();
		subListObj=playerarray.subList(5, playerarray.size());
		System.out.println("New Sub-List from index 5 to"+playerarray.size()+"is :"+subListObj);
		System.out.println();

	}
	public static void main(String[] args){
		PlayersList p=new PlayersList();
		p.add();
		p.display();
		p.search();
		p.extract();
	}
}
