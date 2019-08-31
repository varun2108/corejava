package com.quinnox.jdbc;

import java.sql.*;



public class CallableDemo {
	Connection con;
	public void connect() {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		}
		catch(Exception e){
			System.out.println(e);
		}
		}
	public void addDept(){
		try{
			String query= "{call adjust_salary(100,10)}";
			CallableStatement cstm=con.prepareCall(query);
			
			int cnt = cstm.executeUpdate();
			if(cnt>0)
				System.out.println("Salary updated");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args){
		CallableDemo c=new CallableDemo();
		c.connect();
		c.addDept();
	}

}
