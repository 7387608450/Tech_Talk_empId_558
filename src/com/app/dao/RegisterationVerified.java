package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.pojos.TicToc;
import com.app.pojos.User;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class RegisterationVerified {


	
	
	
	
	/**
	 * this method is use to check that user aleready registerd with us or not
	 * @param u
	 * @return status that present true absent false
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static boolean verifyUserIsAlereadyPresentOrNot(User u) throws SQLException, ClassNotFoundException{
		String firstName=u.getFirstName();
		String lastName=u.getLastName();
		String emailId=u.getEmailId();
		String password=u.getPassword();
		boolean userAlereadyRegisteredOrNot=false;
		boolean status=true;
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con= DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/atmecs","root","root");  
		
		String checkQuery="select *from registeruser";
		
		 Statement stmt=(Statement) con.createStatement();
		 ResultSet rs=stmt.executeQuery(checkQuery);
	
	
		 while(rs.next()){
			 if(rs.getString(3).equals(emailId)){
				 userAlereadyRegisteredOrNot=true;
			
			break;
			 }
			 }
		 if(!userAlereadyRegisteredOrNot){
		 
		 String query="insert into registeruser (firstName, lastName, emailId, password)"   + " values (?, ?, ?, ?)";
		PreparedStatement stmt1=(PreparedStatement) con.prepareStatement(query);
		stmt1.setString(1, firstName);
		stmt1.setString(2, lastName);
		stmt1.setString(3, emailId);
		stmt1.setString(4, password);
	
	 
		 status= stmt1.execute();
		
		
		
	}
		con.close();
		return !status;
	}
	
}
