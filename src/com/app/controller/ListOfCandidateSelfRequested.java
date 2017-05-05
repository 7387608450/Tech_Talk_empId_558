package com.app.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.GetListOfCandidateSelfRequested;
import com.app.pojos.UserRequestingTicToc;

/**
 * Servlet implementation class ListOfCandidateSelfRequested
 */
@WebServlet("/ListOfCandidateSelfRequested")
public class ListOfCandidateSelfRequested extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListOfCandidateSelfRequested() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<UserRequestingTicToc> list = null;
		try {
			list = GetListOfCandidateSelfRequested.getListOfUserSelfRequested();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", list);
		getServletContext().getRequestDispatcher("/views/listOfCandidateWhoSelfRequested.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
