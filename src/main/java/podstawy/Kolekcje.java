package podstawy;

import java.util.*;

public class Kolekcje {
    public static void main(String[] args) {

        String name = "Cezary";

        // Listy
        List<String> train = new ArrayList<>();
        train.add("Józek");
        train.add("Daniel");
        train.add(name);
        System.out.println(train.indexOf(name));
        System.out.println(train.isEmpty());
        System.out.println(train);
        System.out.println(train.get(0));
        System.out.println(train.size());
        train.remove(1);
        System.out.println(train);




        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(5);
        numbers.add(15);
        System.out.println(numbers);

        Queue<Integer> num = new ArrayDeque<>();
        num.add(3);
        num.add(31);
        num.add(23);
        num.add(343);
        System.out.println(num);
        num.remove();
        System.out.println(num);


        Map<Integer,String> mapOne = new HashMap<>();
        Map<Integer,Integer> mapTwo = new HashMap<>();
        Map<String,String> mapThree = new HashMap<>();
        mapThree.put("kot","cat");
        mapThree.put("pies","dog");
//        System.out.println(mapThree);

        String word = "piess";

//        if (mapThree.containsKey(word)){
//            System.out.println(mapThree.get(word));
//        } else {
//            System.out.println("Nie znaleziono");
//        }

//        for(String key: mapThree.keySet()){
//            System.out.println(mapThree.get(key));
//        }

        for(Map.Entry<String,String> element : mapThree.entrySet()){
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }


        List<Integer> number = new ArrayList<>();
        number.add(4);
        number.add(54);
        number.add(14);
        Collections.sort(number);
        System.out.println(number);


        List<Integer> number2 = new LinkedList<>();
        number2.add(5);
        number2.add(7);
        number2.add(1);
        number2.add(9);
        System.out.println(number2);
        number2.add(1,777);
        number2.set(0,555);
        System.out.println(number2);
    }
}
