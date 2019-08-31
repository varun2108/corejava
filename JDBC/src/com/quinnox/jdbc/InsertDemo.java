package com.quinnox.jdbc;
import java.sql.*;

public class InsertDemo {
	public static void main(String[] args){
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
	Statement stmt=con.createStatement();
	int cnt=stmt.executeUpdate("insert into Departments values(345,'lunch',204,2500)");
	if(cnt>0)
		System.out.println("Record inserted successfully");
	else
		System.out.println("Error");
	ResultSet rs=stmt.executeQuery("select count(location_id) from locations");
	while(rs.next()){
		System.out.println("Total no of records is: "+rs.getInt(1));
	
	}
	con.close();
	}
	catch (Exception e){
		System.out.println(e);
	}
}
}
