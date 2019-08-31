package com.quinnox.jdbc;
import java.io.*;
/*
 * A BufferedReader example that reads a file line by line
 */

public class BufferedReaderExample {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("D:/abc/countries.txt")));
			String line = "";
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not exists or insufficient rights");
			e.printStackTrace(); 
		} catch (IOException e) {
			System.out.println("An exception occured while reading the file");
			e.printStackTrace();		}	}}
