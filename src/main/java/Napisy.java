public class Napisy {
    public static void main(String[] args) {
       String napis = "";
       String powitanie = "Cześć!";
       String s = powitanie.substring(0,3);
       System.out.println(s.toUpperCase());
       System.out.println(s.length());
       System.out.println(s.contains("Cz"));
    }
}
