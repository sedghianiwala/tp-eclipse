package isetj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String t1=request.getParameter("t1");
		String s1=request.getParameter("s1");
		String url="";
		
		 switch(s1) {
		 case "google":
			 url ="https://www.google.com/search?q=" + t1;
			 break;
		 case "yahoo":
			 url="https://search.yahoo.com/search?q=" + t1;
			 break;
			 default : 
				 url= "https://www.google.com/search?q=" + t1;
		 }
		 response.sendRedirect(url);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
