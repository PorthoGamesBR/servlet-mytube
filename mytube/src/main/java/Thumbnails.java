import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Thumbnails extends HttpServlet {

    FilesFolder ff = new FilesFolder();
    String thumbPath = ff.filesFolder;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String imageName = request.getQueryString();

        if (imageName.substring(imageName.length() - 3).equals("jpg")) {
            response.setContentType("image/jpeg");
        } else if (imageName.substring(imageName.length() - 3).equals("png")) {
            response.setContentType("image/png");
        } else {
            response.sendError(404);
            return;
        }

        ServletOutputStream out = response.getOutputStream();
        FileInputStream fin = new FileInputStream(thumbPath + imageName.replace("+"," "));

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
