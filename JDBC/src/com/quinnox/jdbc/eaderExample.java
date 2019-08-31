package com.quinnox.jdbc;

import java.io.*;

public class eaderExample {
	public static void main(String[] args){
		try{
			Reader reader=new FileReader("d:/data.txt");
			int data=reader.read();
			while(data!=-1){
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
