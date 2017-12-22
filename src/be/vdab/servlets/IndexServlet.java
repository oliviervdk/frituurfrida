package be.vdab.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index.htm")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html lang='nl'><head>");
		out.println("<title>Frituur Frida</title></head>");
		out.println("<body><h1> Vandaag zijn we ");
		DayOfWeek vandaag = LocalDate.now().getDayOfWeek();
		out.print(vandaag == DayOfWeek.MONDAY || vandaag == DayOfWeek.THURSDAY ? "gesloten" : "open");
		out.println("</h1></body></html>");
	}

}
