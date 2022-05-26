

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Coffeeservlet
 */
@WebServlet("/Coffeeservlet")
public class Coffeeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Coffeeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String typermarque = request.getParameter("c1");
		String textremarque = request.getParameter("ta");
	PrintWriter out = response.getWriter();
	out.println("<html><head>");
	out.println("<title>coffee shop </title></head>");
	out.println("<body>");
	out.println("<p>Merci de nous avoit fai parvenir suivante concernant ");
	out.println("<b>"+typermarque+"</b>");
	out.println("<p>"+textremarque+"</p>");
	out.println("</body></html>");
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
