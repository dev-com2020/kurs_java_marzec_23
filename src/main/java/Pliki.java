import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class Pliki {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("plik.txt");
        Scanner plik = new Scanner(file);
        String zdanie = plik.nextLine();
        System.out.println(zdanie);
    }
}
