package basic;

public class Variable3 {
    public static void main(String[] args) {
        // float score1 = 50;
        float score1 = 50.15f;
        double score2 = 45.125d;
        System.out.println("score =  " + score1);
        System.out.println("score =  " + score2);
        System.out.printf("score =  %.4f, score2 = %f\n", score1, score2);
        System.out.printf("score =  %10.4f, score2 = %.4f\n", score1, score2);

    }
}
