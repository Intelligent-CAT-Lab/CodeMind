import java.util.Scanner;

public class p02334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        final long MOD = (long) Math.pow(10, 9) + 7;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N + K - 1 - i)) % MOD;
            q = (q * (i + 1)) % MOD;
        }

        long inverseQ = pow(q, MOD - 2, MOD);
        System.out.println((p * inverseQ) % MOD);
    }

    private static long pow(long a, long b, long m) {
        if (b == 0) {
            return 1;
        }
        long p = pow(a, b / 2, m);
        if (b % 2 == 0) {
            return (p * p) % m;
        } else {
            return (((p * p) % m) * a) % m;
        }
    }
}