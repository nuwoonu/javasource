package control;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재의 월을 입력해주세요 : ");
        int month = Integer.parseInt(sc.nextLine());
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재 계절은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재 계절은 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("현재 계절은 가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("현재 계절은 겨울입니다.");
                break;
            default:
                System.out.println("월을 정확히 입력해주세요.");
                break;

        }
        /*
         * if (month == 12 || month == 1 || month == 2) {
         * System.out.println("겨울입니다.");
         * } else if (month == 3 || month == 4 || month == 5) {
         * System.out.println("봄 입니다.");
         * } else if (month == 6 || month == 7 || month == 8) {
         * System.out.println("여름입니다.");
         * } else if(month == 9 || month == 10 || month ==11)
         * System.out.println("가을입니다.");
         * }
         * else
         * {
         * System.out.println("숫자를 다시 입력하세요.");
         * }
         */
    }
}
