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
        JSONObject toSend = new JSONObject();
        
        String[] videoList = lerArquivosMP4("");

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
 
    public String[] lerArquivosMP4(String pastaBase) {
        // TODO: Procurar todos os arquivos .mp4 na pasta base
        return new String [] {"Onibus vai derrapar a a a a.mp4"};
    }

    public String acharArquivoDeImagem(String nome, String pastaBase) {
        return nome + ".png";
    }
}
