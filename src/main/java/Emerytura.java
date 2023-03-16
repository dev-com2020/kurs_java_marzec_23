import java.util.Scanner;

public class Emerytura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ile pieniędzy potrzebujesz, żeby przejść na emeryturę? ");
        double goal = in.nextDouble();
        System.out.println("Ile pieniędzy rocznie będziesz wypłacać? ");
        double payment = in.nextDouble();
        System.out.print("Stopa procentowa w %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal){
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("Możesz przejść na emeryturę za "+ years + " lat.");

    }
}
