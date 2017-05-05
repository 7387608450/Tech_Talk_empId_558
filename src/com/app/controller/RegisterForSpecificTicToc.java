package com.app.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.RequestForSpecificTicToc;
import com.app.pojos.User;

/**
 * Servlet implementation class RegisterForSpecificTicToc
 */
@WebServlet("/RegisterForSpecificTicToc")
public class RegisterForSpecificTicToc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterForSpecificTicToc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession(true);
		String id=request.getParameter("register");
		User u=	(User) hs.getAttribute("user");
		String mailId=u.getEmailId();
		System.out.println(mailId);
		RequestForSpecificTicToc.requestForSpecificTicToc(id,mailId);
		request.setAttribute("id", "Applied");
		getServletContext().getRequestDispatcher("/views/dashboard.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
