package com.app.controller;
import static com.app.dao.LoginVerification.*;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.AdminLoggedIn;
import com.app.dao.LoginVerification;
import com.app.pojos.TicToc;
import com.app.pojos.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        
        // TODO Auto-generated constructor stub
    }

    
    
	/**
	 * @throws ServletException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		HttpSession hs=request.getSession(true);
		/**
		 * If session is present
		 */

		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		User loginUser=new User(emailId, password);
		String status=null;
		List<TicToc> listOfTicTocs = null;
			try 
			{
				listOfTicTocs = AdminLoggedIn.adminCredentialAreHere();
				hs.setAttribute("list", listOfTicTocs);
			} 
			catch (Exception e1)
			{
			e1.printStackTrace();
			}
			request.setAttribute("list", listOfTicTocs);
		if(emailId.equals("vijay.jejurkar@atmecs.com") && password.equals("password"))
		{
			
				try {
				
				hs.setAttribute("admin", loginUser);
				getServletContext().getRequestDispatcher("/views/admindashboard.jsp").forward(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		else
		{
		
		
			
				try {
					status=verifyUserBasedOnUserNameAndPassword(loginUser);
					System.out.println(status);
			
					}
					catch (Exception e) 
					{
						e.printStackTrace();
					}
				/**
				 * This if for user present but he or she is not an admin
				 */
					if(status!=null)
					{	
						/*request.setAttribute("list", listOfTicTocs);*/
					//	response.sendRedirect("views/dashboard.jsp?message=" + URLEncoder.encode(status, "UTF-8"));
						hs.setAttribute("user", loginUser);
						request.setAttribute("name", status);
						System.out.println(status);
						getServletContext().getRequestDispatcher("/views/dashboard.jsp").forward(request, response);
					}
					else
					{
						String message = "Invalid UserName Or password";
						response.sendRedirect("index.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
			 
					}
		}
		
	

		
	}
	

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
