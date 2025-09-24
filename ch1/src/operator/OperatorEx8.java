package operator;

import java.util.Scanner;

public class OperatorEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력 : ");
        int input1 = Integer.parseInt(sc.nextLine());
        System.out.println(input1 % 2 == 0 ? "짝수" : "홀수");

    }
}
