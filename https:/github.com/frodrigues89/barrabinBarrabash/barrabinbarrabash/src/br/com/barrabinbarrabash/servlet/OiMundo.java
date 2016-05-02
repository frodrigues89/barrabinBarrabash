package br.com.barrabinbarrabash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OiMundo")
public class OiMundo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>BarraBin BarraBash Livraria Digital</title>");
		out.println("<link href='css/bootstrap.min.css' rel='stylesheet' media='screen'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>BarraBin BarraBash Livraria Digital</h1>");
		out.println("<h1>Oi Mundo</h1>");
		out.println("<script src='http://code.jquery.com/jquery-latest.js'></script>");
		out.println("<script src='js/bootstrap.min.js'></script>");
		out.println("</body>");
		out.println("</html>");
	}
	

}
