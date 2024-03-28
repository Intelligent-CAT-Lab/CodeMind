import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("0.5");
        } else {
            double result = (N + 1) / (double) N / 2;
            System.out.printf("%.10f", result);
        }
    }
}