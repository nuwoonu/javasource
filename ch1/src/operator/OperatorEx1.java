package operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        // int i = 5;
        // i++;
        // System.out.println(i);
        // i--;
        // System.out.println(i);

        // int j = 10;
        // ++j;
        // System.out.println(j);

        int k = 5, i = 0;
        i = k++;
        System.out.println("l = k ++; 실행후 , k=" + k + ", l=" + i);
        k = 5;
        i = 0;
        i = ++k;
        System.out.println("l = ++k; 실행후 , k=" + k + ", l=" + i);
    }
}
