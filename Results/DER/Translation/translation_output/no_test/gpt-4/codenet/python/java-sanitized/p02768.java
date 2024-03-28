import java.util.Scanner;

public class p02768 {
    private static final long MOD = (long)1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        long X = powMod(2, n, MOD) - 1;
        long A = modComb(n, a, MOD);
        long B = modComb(n, b, MOD);
        long ans = (X - A - B + 2 * MOD) % MOD; // Adding 2*MOD to handle negative values
        System.out.println(ans);
    }

    private static long modComb(int n, int a, long mod) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt = (cnt * (n - i)) % mod;
            cnt = (cnt * powMod(i + 1, mod - 2, mod)) % mod;
        }
        return cnt;
    }

    private static long powMod(long base, long exponent, long mod) {
        long result = 1;
        base = base % mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            exponent >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}