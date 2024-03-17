import java.util.*;
import java.math.*;

public class p02654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int MOD = 1000000007;
        int[] factorials = new int[n + 1];
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i % MOD;
        }
        int[] finvs = new int[n + 1];
        finvs[n] = pow(factorials[n], MOD - 2, MOD);
        for (int i = n; i >= 1; i--) {
            finvs[i - 1] = finvs[i] * i % MOD;
        }
        int[] invs = new int[n + 1];
        invs[0] = 1;
        for (int i = 1; i <= n; i++) {
            invs[i] = invs[i - 1] * factorials[i - 1] % MOD;
        }
        int r = n - a;
        int ans = 0;
        for (int l = 0; l < a; l++) {
            int tmp1 = factorials[a] * finvs[l] % MOD * finvs[a - l] % MOD;
            int tmp2 = factorials[n - l - 1] * (a - l) % MOD;
            ans = (ans + (-1) * (l & 1) * tmp1 * tmp2) % MOD;
        }
        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                int tmp1 = factorials[k] * finvs[l] % MOD * finvs[k - l] % MOD;
                int tmp2 = factorials[n - l - 1] * (k - l) % MOD * invs[r + k - l] % MOD;
                ans = (ans + (-1) * (l & 1) * tmp1 * tmp2) % MOD;
            }
        }
        System.out.println(ans);
    }

    public static int pow(int a, int b, int mod) {
        int ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = ans * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return ans;
    }
}