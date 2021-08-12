package com.Front;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Controller.Command;
import com.Controller.LoginController;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String request_URI = request.getRequestURI();
		String context_Path = request.getContextPath();
		String result_URI = request_URI.substring(context_Path.length() + 1);

		Command _interface = null;
		
		if (result_URI.equals("Login.do")) {
			_interface = new LoginController();
		} 
		
		_interface.command(request, response);
	
	}

}
