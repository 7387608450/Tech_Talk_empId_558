package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class RequestForSpecificTicToc {

	public static List<String> requestForSpecificTicToc(String id,String mail){
//		 List<String> list=new ArrayList<>();

		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con= DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/atmecs","root","root");  
			 String query="insert into requestforspecifictictoc (id, emailid)"   + " values (?, ?)";
				PreparedStatement stmt=(PreparedStatement) con.prepareStatement(query);
				stmt.setString(1, id);
				stmt.setString(2, mail);
				
			


				stmt.executeUpdate();
			
			
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return list;
	}
}
