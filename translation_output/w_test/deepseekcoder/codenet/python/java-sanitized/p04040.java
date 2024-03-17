import java.util.Scanner;

public class p04040 {
    static long mod = (long)Math.pow(10,9) + 7;
    static long[] fac = new long[200000];
    static long[] finv = new long[200000];
    static long[] inv = new long[200000];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        COMB_MOD(200000);
        long ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + comb(b - 1 + i, i) * comb(h - 1 - i + w - 1 - b, h - 1 - i)) % mod;
        }
        System.out.println(ans);
    }

    public static void COMB_MOD(int max_n) {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < max_n; i++) {
            fac[i] = fac[i - 1] * i % mod;
            inv[i] = mod - inv[mod % i] * (mod / i) % mod;
            finv[i] = finv[i - 1] * inv[i] % mod;
        }
    }

    public static long comb(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
    }
}