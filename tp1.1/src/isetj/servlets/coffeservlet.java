package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class coffeservlet
 */
@WebServlet("/coffeservlet")
public class coffeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public coffeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String typeremarque =request.getParameter("remarque");
		String texteremarque =request.getParameter("remarque");
		PrintWriter out= response.getWriter();
		out.println("<html><head>");
		out.println("<title>Starbucks coffe </title></head>");
		out.println("<body><img src='coffe.jpg' border='0' height='200' width='200'>");
		out.println("<p>merci de nous avoir fait parvenir la remarque suivant concernant");
		out.println("<b>"+typeremarque+"</b>");
		out.println("<p>"+texteremarque);
		out.println("</body></html>");
		
		response.getWriter();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
