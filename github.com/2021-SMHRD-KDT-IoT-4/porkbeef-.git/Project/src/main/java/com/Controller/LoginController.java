package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Model.MembersDAO;
import com.Model.MembersDTO;

public class LoginController implements Command {

	@Override
	public void command(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("EUC-KR");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MembersDTO dto = new MembersDTO(id, pw);
		MembersDAO dao = new MembersDAO();
		MembersDTO info = dao.login(dto);
		
		if(info != null) {
			System.out.println("�α��� ����");
			
			HttpSession session = request.getSession();
			session.setAttribute("info", info);
			
		}
		
		response.sendRedirect(".jsp");
	}

}