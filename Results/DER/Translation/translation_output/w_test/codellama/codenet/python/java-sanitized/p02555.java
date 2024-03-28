import java.util.Scanner;

public class p02555 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s < 3) {
            System.out.println(0);
            return;
        }
        int n = s / 3;
        int mod = 1000000007;
        long[] fact = new long[2 * s + 1];
        long[] inv = new long[2 * s + 1];
        for (int i = 2; i <= 2 * s + 1; i++) {
            fact[i] = i * fact[i - 1] % mod;
        }
        inv[2 * s] = pow(fact[2 * s], -1, mod);
        for (int i = 2 * s - 1; i >= 1; i--) {
            inv[i - 1] = inv[i] * i % mod;
        }
        long ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1)) % mod;
        }
        System.out.println(ans);
    }

    public static long comb(long x, long y) {
        if (x >= y && y >= 0) {
            return fact[x] * inv[y] % mod * inv[x - y] % mod;
        } else {
            return 0;
        }
    }
}