import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

public class VideoList extends HttpServlet {

    public String videoPath = "/home/portho/Downloads/";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");

        JSONArray ja = new JSONArray();
        JSONObject toSend = new JSONObject();
        
        Set<String> videoList = lerArquivosMP4(videoPath);

        for (String videoName : videoList) {
            JSONObject jo = new JSONObject();

            // Procura por algum arquivo .jpg ou .png que tenha o mesmo nome
            String thumbnailPath = acharArquivoDeImagem(videoName.replace(".mp4",""),"");

            jo.put("miniature_link", "mini.jpg");
            if (thumbnailPath != null){
                jo.put("miniature_link", thumbnailPath);
            }
            jo.put("titulo", videoName.replace(".mp4",""));
            jo.put("video_link", "videos?" + videoName.replace(" ","+"));

            ja.put(jo);

            toSend.put("lista",ja);
        }

        PrintWriter pw = response.getWriter();

        pw.println(toSend.toString());
        pw.close();
    }
 
    public Set<String> lerArquivosMP4(String pastaBase) {
         return Stream.of(new File(pastaBase).listFiles())
                .filter(file -> (!file.isDirectory()) && (file.getName().endsWith(".mp4")))
                .map(File::getName)
                .collect(Collectors.toSet());
    }

    public String acharArquivoDeImagem(String nome, String pastaBase) {
        return nome + ".png";
    }
}
