package com.app.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserRequestingForTicToc;
import com.app.pojos.UserRequestingTicToc;

/**
 * Servlet implementation class RequestForTicToc
 */
@WebServlet("/RequestForTicToc")
public class RequestForTicToc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestForTicToc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailId=request.getParameter("mail");
		String topic=request.getParameter("topic");
		String date=request.getParameter("date");
		String status=null;
		UserRequestingTicToc t=new UserRequestingTicToc(emailId, topic, date);
		try {
			status=UserRequestingForTicToc.addTicTocFromUserSide(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("views/userrequestfortictoc.jsp?message=" + URLEncoder.encode(status, "UTF-8"));
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
