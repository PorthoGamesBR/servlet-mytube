import java.util.Properties;
import java.io.*;

public class FilesFolder {

    public String filesFolder = "";

    public FilesFolder() {
        // TODO: Pegar esse path de uma variavel configuravel pelo usuario, como variável de ambiente
        Properties appProps = new Properties();
        appProps.load(new FileInputStream("app.properties"));
        filesFolder = appProps.getProperty("files.location");
    }
    
}
