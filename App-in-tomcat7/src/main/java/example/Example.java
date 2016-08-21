package example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Example extends HttpServlet 
{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String result = "<html>" +
        	"<body> <h1> Hello World!!! </h1></body>" +
        	"</html>";
        out.println(result);
        out.flush();
        out.close();
    }
}