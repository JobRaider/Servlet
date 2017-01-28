package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;

public class httpPostServletLog extends HttpServlet {
	private Service service = new Service();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String state = request.getParameter("est");
		System.out.println(name);
		System.out.println(state);

		service.insertNewLog(name, state);
		out.print("Log enviado " + name);

		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
