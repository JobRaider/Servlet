package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Log;
import service.Service;

public class ListServlet extends HttpServlet {
	private Service service = new Service();
	List<Log> listAllLog = new ArrayList<Log>();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		listAllLog = service.listAllLogs();
		req.setAttribute("listAllLog", listAllLog);
		redirect(req,resp);

	}
	

	private void redirect(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/List.jsp");
		dispatcher.forward(req,resp);
	}
}