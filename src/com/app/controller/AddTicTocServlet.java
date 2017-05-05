package com.app.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.AddTicTocInToDataBase;
import com.app.dao.AdminLoggedIn;
import com.app.pojos.TicToc;

/**
 * Servlet implementation class AddTicTocServlet
 */
@WebServlet("/AddTicTocServlet")
public class AddTicTocServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTicTocServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in do post");
		String id=request.getParameter("id");
		String date=request.getParameter("date");
		String title=request.getParameter("title");
		String desc=request.getParameter("desc");
		String presentor=request.getParameter("presentor");
		TicToc tictoc=new TicToc(id, date, title, desc, presentor);
		System.out.println(tictoc);
		
		try {
			AddTicTocInToDataBase.addTicToc(tictoc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			request.setAttribute("list", AdminLoggedIn.adminCredentialAreHere());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	getServletContext().getRequestDispatcher("/views/admindashboard.jsp").forward(request, response);
		
	}

}
