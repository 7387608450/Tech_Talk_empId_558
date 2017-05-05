package com.app.controller;
import static com.app.dao.RegisterationVerified.*;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.pojos.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		boolean status = false;
		User user=new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmailId(emailId);
		user.setPassword(password);
	

			try {
				 status=verifyUserIsAlereadyPresentOrNot(user);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	}
			if(status){
			String message = "User Added Sucesfully";
			response.sendRedirect("index.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
			}
			else{
				String message = "Email Id aleready Registered Please Try with other Mail Id";
				response.sendRedirect("index.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
			}
		}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
