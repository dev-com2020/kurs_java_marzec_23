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

        read_data:
        while (years <= 100) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            if (balance >= goal) break read_data;
            years++;
        }

//        while (years <= 100 && balance < goal) {
//            balance += payment;
//            double interest = balance * interestRate / 100;
//            balance += interest;
//            if (balance < goal)
//                years++;
//        }

//        do {
//
//            balance += payment;
//            double interest = balance * interestRate / 100;
//            balance += interest;
//            years++;
//        }
//        while (balance < goal);
//
        System.out.println("Możesz przejść na emeryturę za " + years + " lat.");

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 10; i > 0; i--) {
//            System.out.println("Odliczanie..." + i);
//        }
//        System.out.println("Start!");


//        int i = 10;
//        while (i > 0){
//            System.out.println("Odliczanie..." + i);
//            i--;
//        }

//        Scanner in = new Scanner(System.in);
//        System.out.println("Wybierz opcje (1,2,3,4)");
//        int choice = in.nextInt();
//
//        switch (choice){
//            case 1:
//                System.out.println("Wybrałeś " + choice);
//                break;
//            case 2:
//                System.out.println("Wybrałeś " + choice);
//                break;
//            case 3:
//                System.out.println("Wybrałeś " + choice);
//                break;
//            case 4:
//                System.out.println("Wybrałeś " + choice);
//                break;
//            default:
//                System.out.println("Wybór nie jest prawidłowy!");
//        }


    }


}
