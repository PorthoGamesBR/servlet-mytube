import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

public class VideoList extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");

        JSONArray ja = new JSONArray();
        JSONObject jo = new JSONObject();
        JSONObject toSend = new JSONObject();

        jo.put("video_link", "videos?Onibus+vai+derrapar+a+a+a+a.mp4");
		jo.put("miniature_link", "mini.jpg");
		jo.put("tiulo", "Onibus vai derrapar a a a a");

        ja.put(jo);

        toSend.put("lista",ja);

        PrintWriter pw = response.getWriter();

        pw.println(toSend.toString());
        pw.close();
    }
}
