package operator;

public class OperatorEx5 {
    public static void main(String[] args) {
        int x = 10, y = -5, z = 0;

        int result = x >= 0 ? x : -x;
        int result1 = y >= 0 ? y : -y;
        int result2 = z >= 0 ? z : -z;

        char sign1, sign2, sign3;
        sign1 = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        sign2 = y > 0 ? '+' : (y == 0 ? ' ' : '-');
        sign3 = z > 0 ? '+' : (z == 0 ? ' ' : '-');

        System.out.printf("x = %c%d\n", sign1, result);
        System.out.printf("y = %c%d\n", sign2, result1);
        System.out.printf("z = %c%d\n", sign3, result2);
    }
}
