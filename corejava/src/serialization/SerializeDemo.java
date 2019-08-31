package serialization;
import java.io.*;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		e.name="Micheal Khan";
		e.address="Castle Street, Banglore";
		e.SSN=11122333;
		e.number=101;
		try{
			FileOutputStream fileOut=new FileOutputStream("d:/abc/employee.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialised data is stored");
		}
		catch(Exception i){
			i.printStackTrace();
		}
	}

}
