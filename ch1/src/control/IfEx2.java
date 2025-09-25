package control;

import java.util.Scanner;

public class IfEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int score = Integer.parseInt(sc.nextLine());
        /*
         * if (score >= 90) {
         * System.out.println("A등급입니다.");
         * } else if (score >= 80) {
         * System.out.println("B등급입니다.");
         * } else if (score >= 70) {
         * System.out.println("C등급입니다.");
         * } else {
         * System.out.println("D등급입니다.");
         * }
         */
        char grade = 'F';
        // if (score >= 90) {
        // grade = 'A';
        // } else if (score >= 80) {
        // grade = 'B';

        // } else if (score >= 70) {
        // grade = 'C';
        // } else {
        // grade = 'D';
        // }

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'D';
                break;
        }

        System.out.printf("%c등급입니다.", grade);
    }
}