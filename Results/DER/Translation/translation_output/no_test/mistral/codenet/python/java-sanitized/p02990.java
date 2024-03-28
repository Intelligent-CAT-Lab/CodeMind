import java.util.*;

public class p02990 {
    static int N, K;
    static long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        System.setRecursionLimit(1000000000);

        System.out.println(comb(N - K + 1, K, MOD) * between(N, K, K));
    }

    static long comb(int n, int r, long mod) {
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) * pow(i + 1, mod - 2, mod);
        }
        return res;
    }

    static long between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k - 1, i - 1, MOD);
    }
}