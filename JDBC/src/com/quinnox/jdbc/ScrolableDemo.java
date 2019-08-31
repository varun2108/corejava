package com.quinnox.jdbc;

import java.sql.*;
public class ScrolableDemo {
	public static void main(String[] args) {
				Connection con;
		Statement stmt;
		ResultSet rs;
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");
		   System.out.println("Connecting to database...");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","varunky","redhat");  
			 
stmt=con.createStateement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);  
	rs=stmt.executeQury("select * from training");  
			//reading from bottom to top
			rs.afterLast();
			while(rs.previous())
			{
	System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}
		System.out.println("******************************");
			
			//move the cursor to 3rd record
			rs.absolute(3);
	System.out.println(rs.getInt(1)+"  "+rs.getString(2));                           
		System.out.println("******************************");
			
	//move the cursor to 2nd record using relative()
			rs.relative(-1);
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		System.out.println("******************************");
			
		int i=rs.getRow(); // get cursor position
			System.out.println("cursor position="+i);

			//cleanup
			rs.close();
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
