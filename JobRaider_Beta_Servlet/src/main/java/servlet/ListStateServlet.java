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

public class ListStateServlet extends HttpServlet {
	private Service service = new Service();
	List<Log> listAllLogByState = new ArrayList<Log>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String state = req.getParameter("state");
		listAllLogByState = service.listAllLogsByState(state);
		req.setAttribute("filterList", listAllLogByState);
		redirect(req,resp);
	}
	
	private void redirect(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/LogFilter.jsp");
		dispatcher.forward(req,resp);
	}
}