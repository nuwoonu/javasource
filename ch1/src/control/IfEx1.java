package control;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        int x = 0;
        /*
         * if (x == 0) {
         * System.out.printf("x == 0 \n");
         * x++;
         * }
         * if (x != 0) {
         * System.out.printf("x != 0 ");
         * }
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력 : ");
        int score = Integer.parseInt(sc.nextLine());
        if (score >= 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }
}