import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Videos extends HttpServlet {
    FilesFolder ff = new FilesFolder();
    public String videoPath = ff.filesFolder;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String videoName = request.getQueryString();

        response.setContentType("video/mp4");
        ServletOutputStream out = response.getOutputStream();
        FileInputStream fin = new FileInputStream(videoPath + "/" + videoName.replace("+"," "));

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
