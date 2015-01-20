import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SelectParam extends HttpServlet{
	
	public void doPost(HttpServletRequest request,
						HttpServletResponse response)
						throws IOException, ServletException{
	
		String[] sizes = request.getParameterValues("sizes");
		
		request.setAttribute("sizes",sizes);
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		
		view.forward(request,response);
							
	}
}