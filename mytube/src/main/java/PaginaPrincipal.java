import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class PaginaPrincipal extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("<html><body><h1>Hello World!</h1></body></html>");
        pw.close();
    }
}