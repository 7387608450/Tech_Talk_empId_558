package com.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.AdminLoggedIn;
import com.app.dao.UpdateTickTock;
import com.app.pojos.TicToc;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("newid");
		String date=request.getParameter("newdate");
		String title=request.getParameter("newtitle");
		String desc=request.getParameter("newdesc");
		String presentor=request.getParameter("presentor");
		TicToc t=new TicToc(id, date, title, desc, presentor);
		
		try 
		{
			UpdateTickTock.updateTickTock(t);
			List<TicToc> list=AdminLoggedIn.adminCredentialAreHere();
			request.setAttribute("list", list);
			getServletContext().getRequestDispatcher("views/admindashboard.jsp");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
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
