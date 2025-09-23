package basic;

public class Variable1 {
    public static void main(String[] args) {

        int num = 10;
        int sum = num + 20;
        System.out.println("num 변수 값 : " + num);
        System.out.println("num+20 = " + sum);
        System.out.printf("num 변수 값 : %d", num);

        int age = 25, maxSpeed = 10;
        System.out.println("age=" + age + ", maxSpeed = " + maxSpeed);
        System.out.printf("age=%d, maxSpeed = %d\n", age, maxSpeed);
        System.out.printf("age=%10d, maxSpeed = %5d\n", age, maxSpeed);
        num = 35;
        System.out.println(num);
        final int MAXSPEED = 20;
        System.out.println(MAXSPEED);
    }
}
