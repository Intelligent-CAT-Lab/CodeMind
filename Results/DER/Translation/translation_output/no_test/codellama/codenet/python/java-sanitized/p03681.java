import java.util.Scanner;
import java.math.BigInteger;

public class p03681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int diff = N - M;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println(factorial(N) * factorial(M) * 2 % MAX);
        } else {
            System.out.println(factorial(N) * factorial(M) % MAX);
        }
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}