package com.app.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.pojos.TicToc;
import com.app.pojos.User;
public class AdminLoggedIn {
	public static  List<TicToc> adminCredentialAreHere() throws Exception{
		
		
		boolean status=false;
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con= DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/atmecs","root","root");  
		 String query="select *from tictoc";
		 Statement stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery(query);
	
	List<TicToc> listOfTicToc=new ArrayList<>();
		 while(rs.next()){
			TicToc t=new TicToc(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			listOfTicToc.add(t);
			 
			 }
			
		 

		 con.close();
		return listOfTicToc;
		
	}

}
