import java.util.Date;

public class Formatowanie {
    public static void main(String[] args) {
        double x = 10000.0 / 3.0;
        Date data = new Date();
        System.out.println(x);
        System.out.printf("%.2f pln\n",x);
        System.out.printf("%,.2f pln\n",x);
        System.out.printf("Dziś jest %tA\n",data);
        System.out.printf("Mamy miesiąc %tb\n",data);
        System.out.printf("Mamy rok %tY\n",data);
        System.out.println(data);


    }
}