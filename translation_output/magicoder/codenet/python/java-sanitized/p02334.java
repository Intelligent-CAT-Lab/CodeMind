import java.util.Scanner;

public class p02334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long MOD = 1000000007;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N+K-1-i)) % MOD;
            q = (q * (i+1)) % MOD;
        }

        long inverseQ = pow(q, MOD-2, MOD);
        long result = (p * inverseQ) % MOD;
        System.out.println(result);
    }

    private static long pow(long base, long exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
}