import java.util.Scanner;

public class p02334 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        int MOD = 1000000007;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = p * (N + K - 1 - i) % MOD;
            q = q * (i + 1) % MOD;
        }

        long result = p * modInverse(q, MOD) % MOD;

        System.out.println(result);
    }

    private static long modInverse(long a, int m) {
        return power(a, m - 2, m);
    }

    private static long power(long x, int y, int m) {
        if (y == 0)
            return 1;
        long p = power(x, y / 2, m) % m;
        p = (p * p) % m;

        return (y % 2 == 0) ? p : (x * p) % m;
    }
}