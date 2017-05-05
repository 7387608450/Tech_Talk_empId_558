package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.app.pojos.TicToc;
import com.mysql.jdbc.PreparedStatement;

public class AddTicTocInToDataBase {
	public static void addTicToc(TicToc tictoc) throws Exception{
		
		
		String id=tictoc.getId();
		String date=tictoc.getDate();
		String title=tictoc.getTitle();
		String desc=tictoc.getDesc();
		String presentor=tictoc.getDesc();
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con= DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/atmecs","root","root");  
		 String query="insert into tictoc (id, dateoftictoc, title, disc, presentor)"   + " values (?, ?, ?, ?, ?)";
		PreparedStatement stmt=(PreparedStatement) con.prepareStatement(query);
		stmt.setString(1, id);
		stmt.setString(2, date);
		stmt.setString(3, title);
		stmt.setString(4, desc);
		stmt.setString(5, presentor);
	
	 
		int status= stmt.executeUpdate();
		con.close();
	}

}
