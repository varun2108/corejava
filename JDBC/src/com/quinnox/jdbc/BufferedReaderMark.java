package com.quinnox.jdbc;
import java.io.*;

//This java example source code demonstrates the use of mark() method of BufferedReader class. Basically we mark the stream and use the reset method to go back to the marked index.


public class BufferedReaderMark {

	public static void main(String[] args) {
		System.out.print("Enter Characters: ");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// catch the possible IOException by the read() method
		try { 

			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			reader.mark(6);
			System.out.println("Printing characters after mark");
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			reader.reset();
			System.out.println("Printing characters after reset");
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			// close the BufferedReader object
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

