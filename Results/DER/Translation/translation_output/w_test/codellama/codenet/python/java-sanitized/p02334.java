import java.util.Scanner;

public class p02334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N + K - 1 - i)) % MOD;
            q = (q * (i + 1)) % MOD;
        }

        long result = (p * pow(q, MOD - 2, MOD)) % MOD;
        System.out.println(result);
    }

    private static long pow(long a, long b, long mod) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return result;
    }
}