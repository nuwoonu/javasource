package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두자리 정수를 입력하시오 : ");
        String num = sc.nextLine(); // "문자열" -> 정수로 형변환
        System.out.println("num = " + num);
        System.out.println("num = " + (num + 1));
        int input = Integer.parseInt(num);
        System.out.println("num = " + input);
        System.out.println("num = " + (input + 1));
        sc.close();
    }
}