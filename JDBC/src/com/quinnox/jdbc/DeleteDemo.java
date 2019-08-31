package com.quinnox.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			Statement stmt=con.createStatement();
			int cnt=stmt.executeUpdate("Delete from locations where city='Bombay'");
			if(cnt>0)
				System.out.println("Record deleted successfully");
			else
				System.out.println("Error");

	}
		catch(Exception e){
			System.out.println(e);
		}

}
}
