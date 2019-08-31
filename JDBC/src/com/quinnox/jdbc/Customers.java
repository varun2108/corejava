package com.quinnox.jdbc;
import java.util.Scanner;
import java.sql.*;

public class Customers {
	 Connection con;
	 ResultSet rs;
	 Statement st;
	 PreparedStatement ps;
  	 
	Customers()
	{
		con=null;
	}
	
	public Connection getConnection()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","varunky","redhat");  
				 }
		catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
	
	public void insertCustomer(String name, String city, String contact) {
		try {
			con = getConnection();
		    ps = con.prepareStatement("insert into customer values"
		    		+ "(customer_seq.NEXTVAL,?,?,?)");
		    ps.setString(1, name);
		    ps.setString(2, city);
		    ps.setString(3, contact);
		   
		    int i = ps.executeUpdate();
		    if (i != 0) {
		        System.out.println("Inserted");
		    } else {
		        System.out.println("not Inserted");
		    }
		    con.close();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	
		}
	
	public void getCustomer() 
	{
		  try {
			   con = getConnection();
			   st = con.createStatement();
			   rs = st.executeQuery("select * from customer order by custId");
			   System.out.println("CustId\t CustomerName\t City \t\t Contact No");
			   System.out.println("-----------------------------------------------------------");
			  while (rs.next()) 
			  {
			    System.out.print(rs.getInt(1)+"\t");
			    System.out.print(rs.getString(2)+"\t\t");
			    System.out.print(rs.getString(3)+"\t\t");
			    System.out.println(rs.getString(4));
			  }
			  System.out.println("-----------------------------------------------------------");
			  rs.close();
			  con.close();
			  } 
			  catch (Exception e) 
			  {
			  System.out.println("Error in fetching data" + e);
			  }

	}
	
	public void updateCustomer(int id,String city) 
	{
		try {
			 con = getConnection();
		    ps = con.prepareStatement("update customer"
		    		+ " set city=? where custId=?");
		    ps.setString(1, city);
		    ps.setInt(2,id);
		    int i = ps.executeUpdate();
		    if (i != 0) {
		        System.out.println("City updated");
		    } else {
		        System.out.println("not updated");
		    }
		    con.close();
		} catch (Exception e) {
		    e.printStackTrace();
		}

	}
	
	public void deleteCustomer(int cid) 
	{
		try {
			con = getConnection();
		    ps = con.prepareStatement("delete from customer where custId=?");
		    ps.setInt(1, cid);
		    int i = ps.executeUpdate();
		    if (i != 0) {
		        System.out.println("Customer deleted");
		    } else {
		        System.out.println("Customer Doesn't Exist");
		    }
		    con.close();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Customers c=new Customers();
		String city;
		int cid;
		
		System.out.println("************** Global Tech Solutions **************");
		System.out.println("----------- Customer Management System ----------");
		while(true)
		{
		System.out.println("Press 1 for New Customer \t Press 2 to Display Customers");
		System.out.println("Press 3 for Update Customer \t Press 4 to Delete Customer");
		System.out.println("Press 5 for Exit"); 
			
		Scanner s=new Scanner(System.in);
		int option=s.nextInt();
		
		switch(option)
		{
		case 1: System.out.println("Enter Customer Name, City & Contact no :");
		        String name=s.next();
		        city=s.next();
		        String contactno=s.next();
			c.insertCustomer(name,city,contactno);
			break;
		case 2: c.getCustomer();
				break;
		case 3: System.out.println("Enter CustomerId & City to be Updated:");
        		cid=s.nextInt();
        		city=s.next();
			c.updateCustomer(cid,city);
			break;
		case 4: System.out.println("Enter CustomerId  to be Deleted:");
			cid=s.nextInt();
			c.deleteCustomer(cid);
			break;
		case 5: System.out.println("Program Terminated");
		 	System.exit(0);
		
		default: System.out.println("Invalid Selection");
		          break;
		}
		
		
		}
	}

}