import java.util.Scanner;

import java.util.Properties;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Path;


public class ConfigGenerator {
    public static void main(String[] args) {
        String finalPath = "finalPath";
        Properties appProps = new Properties();

        String userString = "";

        try {
        Path basePath = Paths.get("src/main/resources");
        finalPath = basePath.toAbsolutePath().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        FileInputStream fi;
        
        try {
            fi = new FileInputStream(finalPath + "/app.properties");
            appProps.load(fi);
            userString = appProps.getProperty("cargo.servlet.users");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Arquivo app.properties não encontrado em " + finalPath);
        }

        Scanner scanner = new Scanner(System.in);

        if (userString == null || userString.length() <= 0) {
            
            System.out.print("Nome de usuário: ");
            String username = scanner.nextLine();
    
            System.out.print("Senha: ");
            String password = scanner.nextLine();

            appProps.setProperty("cargo.servlet.users", username + ":" + password + ":" +"USER");

        }
        
        System.out.print("Caminho da pasta de vídeos: ");
        String caminho = scanner.nextLine();
        System.out.println();
        System.out.println(finalPath + "/app.properties");
        System.out.println(caminho);
        if (caminho != null && caminho.length() > 0) {
            appProps.setProperty("files.location", caminho);
        }

        scanner.close();

        try (FileOutputStream out = new FileOutputStream(finalPath + "/app.properties")) {
            appProps.store(out, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}