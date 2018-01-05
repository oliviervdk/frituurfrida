package be.vdab.servlets;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.vdab.entities.Adres;
import be.vdab.entities.Gemeente;

@WebServlet("/index.htm")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/WEB-INF/JSP/index.jsp";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DayOfWeek vandaag = LocalDate.now().getDayOfWeek();
		request.setAttribute("openGesloten", vandaag == DayOfWeek.MONDAY || vandaag == DayOfWeek.THURSDAY ? "gesloten" : "open");
		request.setAttribute("adres", new Adres("Bollewolstraat", "115B",
				new Gemeente("Pijpenberg", 8312)));
		request.getRequestDispatcher(VIEW).forward(request, response);
		
	}
}
