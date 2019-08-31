package com.quinnox.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
					PreparedStatement pstmt=con.prepareStatement("Update employees "+"SET job_id=? "+"Where employee_id=?");
					Scanner s=new Scanner(System.in);
					System.out.println("enter the employee Id");
					int eid=s.nextInt();
					System.out.println("enter the job title");
					String strm=s.next();
					 pstmt.setString(1, strm);
					 pstmt.setInt(2,eid);
					
					int roweffected=pstmt.executeUpdate();
						System.out.println("Row affected : "+roweffected);
						
						eid=205;
						strm="AC_ACCOUNT";
						 pstmt.setString(1, strm);
						 pstmt.setInt(2,eid);
						
						roweffected=pstmt.executeUpdate();
							System.out.println("Row affected : "+roweffected);
						con.close();
			}
				catch(Exception e){
					System.out.println(e);
				}

	}

}
