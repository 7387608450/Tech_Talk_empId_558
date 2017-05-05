package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.app.pojos.TicToc;
import com.mysql.jdbc.PreparedStatement;

public class UpdateTickTock {
	
	public static void updateTickTock(TicToc u) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con= DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/atmecs","root","root");  

		 
		 String query="UPDATE tictoc SET id = ?, dateoftictoc = ?, title = ?, disc = ?, presentor = ?, WHERE id = ?";
		 
		 
			PreparedStatement	 stmt = (PreparedStatement) con.prepareStatement(query);
			stmt.setString(1, u.getId());
			stmt.setString(2, u.getDate());
			stmt.setString(3, u.getTitle());
			stmt.setString(4, u.getDesc());
			stmt.setString(5, u.getPresentor());
                  int count = stmt.executeUpdate(query);

		con.close();
		
		
	}

}
