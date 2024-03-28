import java.util.Scanner;

public class p03505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            int numerator = K - A;
            int denominator = A - B;
            int quotient = numerator / denominator;
            int remainder = numerator % denominator;
            int result = 1 - quotient * 2;
            if (remainder > 0) {
                result -= 1;
            }
            System.out.println(result);
        }
    }
}