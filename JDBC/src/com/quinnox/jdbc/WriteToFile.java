package com.quinnox.jdbc;
import java.io.*;

public class WriteToFile
{ 
public static void main(String args[]) { 

// Writing to a file using BufferedWriter in Java 

try { 
FileWriter writer = new FileWriter("D:/abc/names.txt",true); 
BufferedWriter bwr = new BufferedWriter(writer);  

bwr.write("James"); 
 bwr.newLine();
bwr.write("Hobert"); 
bwr.close(); 

System.out.println("succesfully written to a file"); } 
catch (IOException ioe) { 
ioe.printStackTrace(); 

}
 } 
}