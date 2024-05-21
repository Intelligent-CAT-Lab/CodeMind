import java.util.Scanner;

public class p02334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N + K - 1 - i)) % MOD;
            q = (q * (i + 1)) % MOD;
        }

        System.out.println((p * pow(q, MOD - 2, MOD)) % MOD);
    }

    public static long pow(long base, long exponent, long mod) {
        if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            return pow(base * base % mod, exponent / 2, mod);
        } else {
            return base * pow(base * base % mod, (exponent - 1) / 2, mod) % mod;
        }
    }
}