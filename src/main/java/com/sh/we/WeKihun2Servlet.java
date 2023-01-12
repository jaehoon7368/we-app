package com.sh.we;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WeKihunServlet
 */
@WebServlet("/hello")
public class WeKihun2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("술고래 김기훈");
		response.getWriter()
		.append("Served at: ")
		.append(request.getContextPath())
		.append("93Kihun이 /hello에 응답했습니다.");
	}

}
