import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class RutasProyecto {
    public static void main (String[] args) {
        Path carpeta = Path.of("datos");
        Path archivo = carpeta.resolve("clubes.txt");
        Path copias = carpeta.resolve("copias");
        try{
            Files.createDirectories(carpeta);
            Files.createDirectories(copias);
            if( Files.notExists(archivo)) {
                Files.createFile(archivo);
            }
            System.out.println("Ruta: " + archivo.toAbsolutePath());
            System.out.println("Ruta: " + copias.toAbsolutePath());

        } catch(IOException e){
            System.err.println("No se pudo crear la ruta:"+ e.getMessage());

        }


    }
}
