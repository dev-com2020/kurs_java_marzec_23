public class Instrukcje {
    public static void main(String[] args) {

        int sales = 10001;
        int target = 10000;
        String perform = "";
        int bonus = 0;

        if (sales > target) {
            perform = "Dobrze";
            bonus = 150;
        } else if (sales == target) {
            perform = "Średnio";
            bonus = 100;
        } else {
            perform = "Słabo";
            bonus = -100;
        }

//        if (sales > target) bonus = 123; else bonus = -100;


        System.out.println(bonus);
    }
}
