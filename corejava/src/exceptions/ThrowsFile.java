package exceptions;
import java.io.*;

public class ThrowsFile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("d:\\Data1.txt");
		file.close();
	}

}
