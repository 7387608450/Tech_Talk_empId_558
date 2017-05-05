package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.app.controller.RequestForTicToc;
import com.app.pojos.UserRequestingTicToc;
import com.mysql.jdbc.PreparedStatement;

public class UserRequestingForTicToc {
	
	
	public static String addTicTocFromUserSide(UserRequestingTicToc t) throws Exception {
		String status="Tic not added ....";
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con= DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/atmecs","root","root");  
		 String query="insert into requestfortictoc (emailId, topic, date)"   + " values (?, ?, ?)";
		PreparedStatement stmt1=(PreparedStatement) con.prepareStatement(query);
		stmt1.setString(1, t.getEmailId());
		stmt1.setString(2, t.getTopic());
		stmt1.setString(3, t.getDate());
		
	
	 
		 stmt1.execute();
		 status="Tic Toc added sucessfully";
		 con.close();
		return status;
		
	}

}
