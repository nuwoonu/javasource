package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("첫번째 숫자입력 : ");
        int input1 = Integer.parseInt(in.nextLine());
        System.out.println(input1 > 0 ? "양수" : "음수");

    }
}
