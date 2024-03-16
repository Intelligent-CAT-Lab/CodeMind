import java.util.*;
import java.math.*;

public class p02685 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int mod = 998244353;
        int ans = 0;
        for (int x = 0; x <= k; x++) {
            ans += m * Math.pow(m - 1, n - 1 - x, mod) * mod_comb_k(n - 1, x, mod);
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static int mod_comb_k(int n, int k, int mod) {
        int res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - k + i) % mod * i % mod;
        }
        return res;
    }
}