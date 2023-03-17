package podstawy;

public class Napisy {
    public static void main(String[] args) {
        String napis = "";
        String powitanie = " Cze ść! ";
        String powitanie2 = " cześć!";
        String s = powitanie.substring(0, 3);
        String message = "Orange.";
        int year = 2023;
        int mon = 3;
        String all = String.join(" ", powitanie, message);
        String rep = "Java ".repeat(5);
        String rep2 = "Cześć Orange".replace("Orange", "Plus");


//       System.out.println(s.toUpperCase());
//        System.out.println(rep2);
        System.out.println(powitanie.strip());
        System.out.println(powitanie.trim());
//       System.out.println(s.length());
//       System.out.println(s.contains("Cz"));
//        System.out.println(powitanie.equals(powitanie2));
//        System.out.println(powitanie.equalsIgnoreCase(powitanie2));
//        System.out.println(powitanie.charAt(1));
//        System.out.println(powitanie + " " + message + (year + mon));
//        System.out.println(year + mon + powitanie + " " + message);
        System.out.printf("Mamy rok %d i miesiąc %d", year, mon);
//        System.out.println(all);
//        System.out.println(rep);


    }
}
