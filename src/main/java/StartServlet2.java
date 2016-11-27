import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by marcin.kowalski on 20/11/16.
 */
@WebServlet("/startServlet2")
public class StartServlet2 extends HttpServlet {

	@Override protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

		PrintWriter out = httpServletResponse.getWriter();
		out.println("SERVLET2");

	}
}
