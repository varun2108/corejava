package collections;
import java.util.*;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Book> list =new ArrayList<Book>();
		
		Book b2=new Book(102,"c++","Yashr","bpb",5);
		Book b3=new Book(103,"Let us c","Yashwanth kanekar","bpb",8);
		list.add(new Book(101,"Let us c","Yashwanth kanekar","bpb",8));
		list.add(b2);
		list.add(b3);
		
		for(Book b:list){
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
