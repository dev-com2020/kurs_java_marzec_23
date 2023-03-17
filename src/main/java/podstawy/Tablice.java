package podstawy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Tablice {
    public static void main(String[] args) {

//        int[] liczby;
        int[] liczby = new int[100];

        for (int i = 0; i < 100; i++) {
            liczby[i] = i;
        }

//        for (int i=0; i < liczby.length; i++){
//            System.out.println(liczby[i]);
//        }

//        for (int element : liczby){
//            System.out.println(element);
//        }


        int[] small = {2, 3, 4, 5, 6, 7,};
        small[2] = 100;
//        System.out.println(small[5] + small[0]);
        Arrays.sort(small);

//        for (int elem: small){
//            System.out.println(elem);
//        }

//        int[] luckyNumbers = small;
        int[] luckyNumbers = Arrays.copyOf(small, 2 * small.length);
//
//        for (int elem : luckyNumbers) {
//            System.out.println(elem);
//        }


        String[] autorzy = {
                "Bartek Zalewski",
                "Józef Buczek",
                "Asia Parus",
        };


        double[][] balance;
//        balance = new double[year][rates];

        int[][] square =
                {
                        {4, 5, 6, 7},
                        {1, 0, 2, 3},
                        {3, 4, 1, 2},
                        {9, 7, 3, 2},
                };
        square[0][0] = 100;
//        System.out.println(square[0][0]);
        for (int[] row: square)
            for (int value: row){
                System.out.println(value);
            }

//        System.out.println(Arrays.deepToString(square));

//        cyfry = new int[]{4, 5, 6, 7, 8};

//        for (int i : new int[]{4, 5, 6, 7, 8}) {
//
//        }


    }
}
