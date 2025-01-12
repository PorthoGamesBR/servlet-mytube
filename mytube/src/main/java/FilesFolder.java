import java.util.Properties;
import java.io.*;

public class FilesFolder {

    public String filesFolder = "";

    public FilesFolder() {
        Properties appProps = new Properties();
        try {
            appProps.load(new FileInputStream("app.properties"));
            filesFolder = appProps.getProperty("files.location");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
