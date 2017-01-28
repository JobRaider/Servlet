package servlet;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;

public class httpPostServlet extends HttpServlet {
	private Service service = new Service();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String password = request.getParameter("pass");
		String dni = request.getParameter("dni");
		
		System.out.println(name);
		System.out.println(password);
		System.out.println(dni);

		service.insertNewUser(name, password, dni);
		out.print("Usuario Registrado "+ name);

		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
