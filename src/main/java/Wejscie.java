import java.util.Scanner;

public class Wejscie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jak masz na imię? ");
        String name = in.nextLine();
        System.out.println("Twoje imię: " + name);
        System.out.println("Ile masz lat? ");
        int age = in.nextInt();
        System.out.println("Masz " + age + " lat");
    }
}
