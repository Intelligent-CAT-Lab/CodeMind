import java.util.Scanner;

public class p02334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long MOD = 1000000007;

        long p = 1, q = 1;
        for (int i = 0; i < N; i++) {
            p = p * (N + K - 1 - i) % MOD;
            q = q * (i + 1) % MOD;
        }

        System.out.println(p * pow(q, MOD - 2, MOD) % MOD);
    }

    public static long pow(long a, long b, long mod) {
        long result = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return result;
    }
}