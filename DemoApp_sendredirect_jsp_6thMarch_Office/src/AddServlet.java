import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author Hariom Yadav | 06-Mar-2020
 *
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("add.jsp");//sending to jsp, but different request, and that request dones not contain val1 and val2
		//response.getWriter().print("add servelt");
	}
}
