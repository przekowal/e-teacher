import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by marcin.kowalski on 18/11/16.
 */

@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet {

	public HelloWorldServlet(){
		super();
	}

	@Override protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

		PrintWriter out = httpServletResponse.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.print("<h1>Hello</h1>");
		out.println("</body>");
		out.println("</html>");

	}
}
