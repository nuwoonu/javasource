package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        int a = 10, b = 4;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        System.out.printf("%d %% %d = %d\n", a, b, a % b);
        System.out.printf("%d / %.1f = %.1f\n", a, (float) b, a / (float) b);

        // char c = 'a', c2 = c, c3 = ' ';

        // c3 = (char) (c + 1);
        // int i = c + 1;
        // c2++;
        // System.out.println("i = " + i);
        // System.out.println("c2 = " + c2);
        // System.out.println("c3 = " + c3);
        /*
         * for (char j = 'a'; j <= 'z'; j++) {
         * System.out.println(j + " ");
         * }
         */
    }
}
