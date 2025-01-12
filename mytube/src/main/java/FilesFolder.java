import java.util.Properties;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FilesFolder {

    public String filesFolder = "";

    public FilesFolder() {
        Properties appProps = new Properties();
        String finalPath = "finalPath";

        try {
            Path basePath = Paths.get(FilesFolder.class.getProtectionDomain().getCodeSource().getLocation().toURI());
            System.out.println("Base path: " + basePath);
            finalPath = basePath.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fi = new FileInputStream("app.properties");
            appProps.load(fi);
            filesFolder = appProps.getProperty("files.location");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Arquivo app.properties não encontrado em " + finalPath);
        }
        
    }
    
}
