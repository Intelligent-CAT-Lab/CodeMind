import java.util.*;

public class p02654 {

    public static long[] prepare(int n, int MOD) {
        long[] factorials = new long[n + 1];
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i % MOD;
        }

        long[] finvs = new long[n + 1];
        finvs[n] = pow(factorials[n], MOD - 2, MOD);
        for (int i = n; i > 1; i--) {
            finvs[i - 1] = finvs[i] * i % MOD;
        }

        return new long[]{factorials, finvs};
    }

    public static long pow(long a, long b, int MOD) {
        if (b == 0) {
            return 1;
        }
        long res = pow(a, b / 2, MOD);
        res = res * res % MOD;
        if (b % 2 == 1) {
            res = res * a % MOD;
        }
        return res;
    }

    public static long solve(int n, int a) {
        int MOD = (int) Math.pow(10, 9) + 7;
        long[] prepared = prepare(n, MOD);
        long[] facts = prepared[0];
        long[] finvs = prepared[1];
        
        long[] invs = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            invs[i] = (facts[i - 1] * finvs[i]) % MOD;
        }

        int r = n - a;
        long ans = 0;

        for (int l = 0; l < a; l++) {
            long tmp1 = (facts[a] * finvs[l] % MOD) * finvs[a - l] % MOD;
            long tmp2 = (facts[n - l - 1] * (a - l) % MOD);
            ans = (ans + (Math.pow(-1, l & 1) * tmp1 * tmp2) % MOD + MOD) % MOD;
        }

        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                long tmp1 = (facts[k] * finvs[l] % MOD) * finvs[k - l] % MOD;
                long tmp2 = (facts[n - l - 1] * (k - l) % MOD) * invs[r + k - l] % MOD;
                ans = (ans + (Math.pow(-1, l & 1) * tmp1 * tmp2) % MOD + MOD) % MOD;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        System.out.println(solve(n, a));
    }
}