package be.vdab.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.vdab.entities.Saus;

@WebServlet("/sauzen.htm")
public class SausServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/WEB-INF/JSP/sauzen.jsp";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Saus> sauzen =  Arrays.asList(
			new Saus(1L, "cocktail", Arrays.asList("mayonaise", "ketchup", "wiskey")),
			new Saus(2L, "mayonaise", Arrays.asList("Eigeel", "citroen", "olie", "mosterd", "peper", "zout")),
			new Saus(3L, "mosterd", Arrays.asList("mosterdzaad", "azijn")),
			new Saus(4L, "tartare", Arrays.asList("mayonaise", "bieslook", "sjalotte")),
			new Saus(1L, "vinaigrette", Arrays.asList("Olie", "azijn", "peper", "zout")));
		request.setAttribute("sauzen", sauzen);
		request.getRequestDispatcher(VIEW).forward(request, response);
	}
}
