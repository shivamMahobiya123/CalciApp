package perform;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CalciServ
 */
public class CalciServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<center>");
		int x,y;
		x=Integer.parseInt(request.getParameter("txtfno"));
		y=Integer.parseInt(request.getParameter("txtsno"));
		String str=request.getParameter("operation");
		if(str.equals("add"))
			out.println("<h1>Result of addition is:"+(x+y)+"</h1>");
		else if(str.equals("sub"))
			out.println("<h1>Result of Subtraction is:"+(x-y)+"</h1>");
		else if(str.equals("mul"))
			out.println("<h1>Result of Multiplication is:"+(x*y)+"</h1>");
		else 
			out.println("<h1>Result of Division is:"+(x/y)+"</h1>");
		out.close();
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
