package com.app.dao;
import com.app.pojos.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class GetListOfCandidateSelfRequested {
	public static List<UserRequestingTicToc> getListOfUserSelfRequested() throws SQLException{
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		Connection con= DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/atmecs","root","root");  
		 String query="select *from requestfortictoc";
		 Statement stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery(query);
	
	List<UserRequestingTicToc> listOfTicToc=new ArrayList<>();
		 while(rs.next()){
			UserRequestingTicToc t=new UserRequestingTicToc(rs.getString(1), rs.getString(2), rs.getString(3));
			listOfTicToc.add(t);
			 
			 }
			
		 

		 con.close();
		return listOfTicToc;
		
	}

}
