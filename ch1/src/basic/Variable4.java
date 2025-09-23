package basic;

public class Variable4 {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println(flag ? "참" : "거짓");
        // 문자형
        char ch = 'a', ch2 = '가';
        // String cd = "ab";
        System.out.println(ch + "\t" + ch2 + "\t");
        System.out.printf("ch = %10c\n", ch);
        // System.out.println(ch + "\t" + ch2 + "\t");
        // System.out.println("ch = " + (ch + 1));
        // System.out.println("ch2 = " + (ch2 + 1));
        System.out.printf("ch2 = %c\n", (ch2 + 1));
        System.out.printf("ch2 = %d", (ch2 + 1));
    }
}
