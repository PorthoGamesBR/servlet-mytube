import java.util.Properties;
import java.io.*;

public class FilesFolder {

    public String filesFolder = "";

    public FilesFolder() {
        Properties appProps = new Properties();
        String finalPath = "";
        try {
            FileInputStream fi = new FileInputStream("app.properties");
            finalPath = new File("app.properties").getAbsolutePath();
            appProps.load(fi);
            filesFolder = appProps.getProperty("files.location");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Arquivo app.properties não encontrado em " + finalPath);
        }
        
    }
    
}
