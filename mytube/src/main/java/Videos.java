import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Videos extends HttpServlet {

    public String videoPath = "/home/portho/Downloads/";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("video/mp4");
        ServletOutputStream out = response.getOutputStream();
        FileInputStream fin = new FileInputStream(videoPath + "video.mp4");

        byte [] buf = new byte[4096];
        int read;
        while((read = fin.read(buf)) != -1)
        {
            out.write(buf, 0, read);
        }

        fin.close();
        out.flush();
        out.close();
    }
}
