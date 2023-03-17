package podstawy;

public class Builder {
    public static void main(String[] args) {
        int year = 2023;
        int mon = 3;
        StringBuilder build = new StringBuilder();
        build.append(year);
        build.append(mon);
        String completed = build.toString();
        System.out.println(completed);
    }
}
