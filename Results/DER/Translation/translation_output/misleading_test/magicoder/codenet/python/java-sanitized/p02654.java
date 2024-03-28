import java.util.*;

public class p02654 {
    static final int MOD = (int)1e9 + 7;
    static int[] factorials, finvs, invs;

    static void prepare(int n) {
        factorials = new int[n + 1];
        finvs = new int[n + 1];
        invs = new int[n + 1];
        factorials[0] = factorials[1] = 1;
        finvs[n] = pow(factorials[n], MOD - 2);
        for (int i = 2; i <= n; i++) {
            factorials[i] = (int)((long)factorials[i - 1] * i % MOD);
        }
        for (int i = n; i > 1; i--) {
            finvs[i - 1] = (int)((long)finvs[i] * i % MOD);
        }
        for (int i = 1; i <= n; i++) {
            invs[i] = (int)((long)factorials[i - 1] * finvs[i] % MOD);
        }
    }

    static int pow(int a, int b) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = (int)((long)res * a % MOD);
            }
            a = (int)((long)a * a % MOD);
            b >>= 1;
        }
        return res;
    }

    static int solve(int n, int a) {
        prepare(n);
        int r = n - a;
        int ans = 0;
        for (int l = 0; l < a; l++) {
            int tmp1 = (int)((long)factorials[a] * finvs[l] % MOD * finvs[a - l] % MOD);
            int tmp2 = (int)((long)factorials[n - l - 1] * (a - l) % MOD);
            ans = (ans + (l & 1 == 0 ? 1 : -1) * tmp1 * tmp2 % MOD) % MOD;
        }
        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                int tmp1 = (int)((long)factorials[k] * finvs[l] % MOD * finvs[k - l] % MOD);
                int tmp2 = (int)((long)factorials[n - l - 1] * (k - l) % MOD * invs[r + k - l] % MOD);
                ans = (ans + (l & 1 == 0 ? 1 : -1) * tmp1 * tmp2 % MOD) % MOD;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(solve(n, a));
    }
}