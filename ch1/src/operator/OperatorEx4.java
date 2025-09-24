package operator;

public class OperatorEx4 {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(x > 10 && x < 20);

        int i = 6;
        System.out.println(i % 2 == 0 || i % 3 == 0);
        System.out.println((i % 2 == 0 || i % 3 == 0) && i % 6 != 0);

        char ch = 'a';
        boolean result = 'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z';

        System.out.println(!result);
    }
}
