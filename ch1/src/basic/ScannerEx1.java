package basic;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력");
        int input = sc.nextInt(); // int로 값을 입력 받을것이다.
        System.out.printf("입력값 %d", input);
        sc.close();
    }
}