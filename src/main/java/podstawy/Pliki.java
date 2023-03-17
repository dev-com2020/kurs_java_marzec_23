package podstawy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class Pliki {
    public static void main(String[] args) throws IOException, FileNotFoundException{

//        PrintWriter zapis = new PrintWriter("plik.txt");
//        zapis.println("Ala ma kota");
//        zapis.close();

try
{
    Scanner plik = new Scanner(Path.of("plik322.txt"));
//        Scanner plik = new Scanner(Path.of("D:\\katalog\\plik.txt"));

        String zdanie = plik.nextLine();
        System.out.println(zdanie);
        plik.close();
    }
catch (IOException e) {
            System.out.println("Wystąpił błąd w nazwie pliku..." + e.getMessage());
}

    }
}