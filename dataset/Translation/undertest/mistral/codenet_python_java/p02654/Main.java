import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p02654 {
    public static void main(String[] args) {
        int n = 3;
        int a = 1;
        System.out.println(solve(n, a));
    }

    public static int solve(int n, int a) {
        int MOD = (int) Math.pow(10, 9) + 7;
        int[] factorials = new int[n + 1];
        Arrays.fill(factorials, 1);
        for (int i = 2; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i % MOD;
        }
        int[] finvs = new int[n + 1];
        Arrays.fill(finvs, 1);
        finvs[n] = pow(factorials[n], MOD - 2, MOD);
        for (int i = n - 1; i >= 1; i--) {
            finvs[i - 1] = finvs[i] * i % MOD;
        }
        int[] invs = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            invs[i] = factorials[i - 1] * finvs[i] % MOD;
        }
        int r = n - a;
        int ans = 0;
        for (int l = 0; l < a; l++) {
            int tmp1 = factorials[a] * finvs[l] % MOD * finvs[a - l] % MOD;
            int tmp2 = factorials[n - l - 1] * (a - l) % MOD;
            ans = (ans + (-1) ** (l & 1) * tmp1 * tmp2) % MOD;
        }
        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                int tmp1 = factorials[k] * finvs[l] % MOD * finvs[k - l] % MOD;
                int tmp2 = factorials[n - l - 1] * (k - l) % MOD * invs[r + k - l] % MOD;
                ans = (ans + (-1) ** (l & 1) * tmp1 * tmp2) % MOD;
            }
        }
        return ans;
    }

    public static int pow(int x, int y, int mod) {
        int res = 1;
        while (y != 0) {
            if (y % 2 == 1) {
                res = (res * x) % mod;
            }
            y = y >> 1;
            x = (x * x) % mod;
        }
        return res;
    }
}