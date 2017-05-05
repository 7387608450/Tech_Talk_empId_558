package com.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.AdminLoggedIn;
import com.app.dao.DeleteTickTock;
import com.app.dao.RequestForSpecificTicToc;
import com.app.pojos.TicToc;
import com.app.pojos.User;

/**
 * Servlet implementation class DeleteTicToc
 */
@WebServlet("/DeleteTicToc")
public class DeleteTicToc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTicToc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("delete request");
	String id=request.getParameter("delete");
	String update =request.getParameter("update");
	String requested=request.getParameter("request");
	System.out.println(update);
	
	/**
	 * This if for delte tictoc
	 */
	if(id!=null)
	{
		try 
		{
		DeleteTickTock.delteTickTock(id);
		request.setAttribute("list", AdminLoggedIn.adminCredentialAreHere());
		} 
		catch (Exception e) 
		{
		e.printStackTrace();
		}
			getServletContext().getRequestDispatcher("/views/admindashboard.jsp").forward(request, response);
	}
	
	/**
	 * This else for update tictoc
	 */
	else
	{
		if(update!=null)
		{
			try 
			{
			List<TicToc> list=AdminLoggedIn.adminCredentialAreHere();
			TicToc t=new TicToc();
			for (TicToc ticToc : list) {
				if(ticToc.getId().equals(update)){
					t.setId(ticToc.getId());
					t.setDate(ticToc.getDate());
					t.setDesc(ticToc.getDesc());
					t.setPresentor(ticToc.getPresentor());
					t.setTitle(ticToc.getTitle());
					break;
				}
				
			}
			list.clear();
			list.add(t);
			System.out.println(list);
			request.setAttribute("list", list);
			getServletContext().getRequestDispatcher("/views/updateTicToc.jsp").forward(request, response);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		}
		/**
		 * No of request for specific tictoc
		 */
		else{
			
			HttpSession hs=request.getSession(true);
			/*User u=(User)hs.getAttribute("user");
			System.out.println(u);*/
			List<String> emailOfRequested=RequestForSpecificTicToc.requestForSpecificTicToc( requested);
			request.setAttribute("name", "Admin");
			request.setAttribute("list", emailOfRequested);
			getServletContext().getRequestDispatcher("/views/showlistofrequestforspecifictictoc.jsp").forward(request, response);
			
		}
		
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
