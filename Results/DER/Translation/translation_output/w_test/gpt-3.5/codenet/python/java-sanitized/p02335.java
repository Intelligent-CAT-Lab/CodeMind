import java.util.Scanner;

public class p02335 {
    public static void main(String[] args) {
        final long MOD = (long) Math.pow(10, 9) + 7;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long result;
        if (n < k) {
            result = C(k, n) % MOD;
        } else if (n > k) {
            result = 0;
        } else {
            result = 1;
        }

        System.out.println(result);
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static long P(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static long C(int n, int r) {
        return P(n, r) / factorial(r);
    }

    public static long H(int n, int r) {
        return C(n + r - 1, r);
    }
}