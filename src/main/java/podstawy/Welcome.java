package podstawy;

import java.util.Locale;
import java.util.Scanner;

/**
 Pierwszy program w Java
 @version 1.0
 @author TK
 */

public class Welcome {
    public static void main(String[] args) {

        var in = new Scanner(System.in);
        System.out.println("Podaj rodzaj prenumeraty: (CYFROWA, DRUKOWANA)");
        String input = in.next().toUpperCase();
        Rodzaj rodzaj = Enum.valueOf(Rodzaj.class,input);
        System.out.println("Wybrany rodzaj: " + rodzaj);





//        final int ROK = 2023;
//        final int MONTH = 3;
//
//        var pensja = 100.50;
//        int wiek_100;
//        boolean done,undone;
//        long populacjaZiemi;
//        wiek_100 = 40;
//        var x = 12.0;
//        var y = 2.5;
//        var z = 2;
//        double wynik = x * y/z + x;
//        double w = Math.sqrt(x);
//        double c = 9.97;
//        int nc = (int)c;

//        x = x + 4;
//        x+= 4;
//        int n = 12;
//        n++;
//        n--;
//        System.out.println(n);
//        System.out.println(w);
//        System.out.println("Witaj Orange!");
//        System.out.println("Witaj Orange po raz drugi!");
//        System.out.println(pensja);
//        System.out.println(wiek_100);
//        System.out.println(wynik);
//        System.out.println(nc);
//        System.out.println(x == n);
//        System.out.println(x);
//        System.out.println(x != n);
//        System.out.println(x < y ? x: y);
// > < <= >=
//        && ||
//        & (bitowa koniunkcja) | (bitowa alternatywa) ^ (lub wykluczające) ~(bitowa negacja)
//        warunek ? wyrażenie1 : wyrażenie2
    }
}