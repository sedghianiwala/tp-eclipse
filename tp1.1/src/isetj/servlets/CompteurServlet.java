package isetj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class CompteurServlet
 */
@WebServlet("/CompteurServlet")
public class CompteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  HttpSession session = request.getSession();
	        
	        // Récupération du compteur stocké en session, ou initialisation à zéro s'il n'existe pas encore
	        Integer compteur = (Integer) session.getAttribute("compteur");
	        if (compteur == null) {
	            compteur = 0;
	        }
	        
	        // Incrémentation du compteur
	        compteur++;
	        
	        // Stockage du nouveau compteur en session
	        session.setAttribute("compteur", compteur);
	        response.setContentType("text/html");
	        response.getWriter().println("<p>Nombre de fois que vous avez accédé à cette page : " + compteur + "</p>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
