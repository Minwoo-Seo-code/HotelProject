package com.project.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dao.UserDAO;

public class FindIdAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "./user/findIdResult.jsp";
				
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		String userPhone = request.getParameter("userPhone");
		
		System.out.println("userName : " + userName);
		System.out.println("userPwd : " + userPwd);
		System.out.println(" userPhone : " + userPhone);
		
		UserDAO userDAO = UserDAO.getInstance();
		String userId = userDAO.findUserId(userName, userPwd, userPhone);
		
		System.out.println("userId : " + userId);
		
		request.setAttribute("userId", userId);
		request.getRequestDispatcher(url).forward(request, response);
		
		
	}
}
