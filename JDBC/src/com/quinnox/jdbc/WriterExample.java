package com.quinnox.jdbc;

import java.io.*;

public class WriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{
				Writer w=new FileWriter("d:/data.txt");
				String content = "She Sells Sea Shells In the Sea";
				w.write(content);
				w.close();
				System.out.println("Data  Written");
				
			}
			catch(IOException e){
				e.printStackTrace();
			}
	}

}
