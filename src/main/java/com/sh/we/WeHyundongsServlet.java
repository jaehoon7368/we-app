package com.sh.we;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WeHyundongsServlet
 */
@WebServlet("/hello")
public class WeHyundongsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		System.out.println("푸쉬 테스트원 ! ");
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("hyundongs가 /hello 에 응답했습니다.");
		

	
	}




}







