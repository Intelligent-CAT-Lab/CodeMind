import java.util.*;

public class p04040 {
    private static final int mod = 1000000007;
    private static int[] fac = new int[1000000];
    private static int[] finv = new int[1000000];
    private static int[] inv = new int[1000000];
    private static int max = 1000000;

    public COMB_MOD() {
        Arrays.fill(fac, 0);
        Arrays.fill(finv, 0);
        Arrays.fill(inv, 0);
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < max; i++) {
            fac[i] = fac[i - 1] * i % mod;
            inv[i] = mod - inv[mod % i] * (mod / i) % mod;
            finv[i] = finv[i - 1] * inv[i] % mod;
        }
    }

    public int comb(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        COMB_MOD c = new COMB_MOD();
        int ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + c.comb(b - 1 + i, i) * c.comb(h - 1 - i + w - 1 - b, h - 1 - i)) % mod;
        }
        System.out.println(ans);
    }
}