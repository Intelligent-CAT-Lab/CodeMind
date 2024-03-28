import java.util.Scanner;

public class p02768 {
    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long X = modPow(2, n, MOD) - 1;
        long A = modComb(n, a, MOD);
        long B = modComb(n, b, MOD);
        long ans = (X - A - B + 2 * MOD) % MOD;
        System.out.println(ans);
        scanner.close();
    }

    private static long modPow(long base, int exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) != 0) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }

    private static long modComb(int n, int a, long mod) {
        long cnt = 1;
        for (int i = 0; i < a; ++i) {
            cnt = (cnt * (n - i)) % mod;
            cnt = (cnt * modPow(i + 1, (int)mod - 2, mod)) % mod;
        }
        return cnt;
    }
}