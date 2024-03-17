import java.util.Scanner;

public class p02768 {
    static final long MOD = 1000000007;

    static long modComb(int n, int a) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt *= (n - i);
            cnt *= pow(i + 1, MOD - 2, MOD);
            cnt %= MOD;
        }
        return cnt;
    }

    static long pow(long x, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * x) % mod;
            }
            x = (x * x) % mod;
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long X = pow(2, n, MOD) - 1;
        long A = modComb(n, a);
        long B = modComb(n, b);
        long ans = (X - A - B + MOD) % MOD;
        System.out.println(ans);
    }
}