package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DeleteTickTock {

	

	public static void delteTickTock(String id) throws Exception {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}  
		Connection con = null;
		try {
			con = DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/atmecs","root","root");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
		   String query = "delete from tictoc where id = ?";
		      PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
		      preparedStmt.setString(1, id);

		      // execute the preparedstatement
		      preparedStmt.execute();
		 con.close();
		
	}
	
	
	public static void updateTickTock(String update){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}  
		Connection con = null;
		try {
			con = DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/atmecs","root","root");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
		   String query = " from tictoc where id = ?";
		      try {
				PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
				  preparedStmt.setString(1, update);

				  // execute the preparedstatement
				  preparedStmt.execute();
				  con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}
}
