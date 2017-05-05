package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.app.pojos.User;
import com.mysql.jdbc.PreparedStatement;

public class LoginVerification {
	public static String verifyUserBasedOnUserNameAndPassword(User u) throws Exception{
		String userName=null;
		String emailId=u.getEmailId();
		String password=u.getPassword();
		boolean status=false;
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con= DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/atmecs","root","root");  
		 String query="select *from registeruser";
		 Statement stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery(query);
	
	
		 while(rs.next()){
			String mail=rs.getString(3);
			String pass=rs.getString(4);
			
			if(mail.equals(emailId) && pass.equals(password)){
				userName=rs.getString(1)+" "+rs.getString(2);
				
				break;
			}
			 }
			
		 

		 con.close();
		return userName;
				 
		 
	 

	}

}
