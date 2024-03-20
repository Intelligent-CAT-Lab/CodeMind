import java.util.*;
import java.math.*;

public class p04041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int m = 1 << (X+Y+Z);
        int[] S = new int[m];
        int L = Math.max(X, Math.max(Y, Z));
        Set<Integer> ss = new HashSet<>();
        Set<Integer> tt = new HashSet<>();
        int Z0 = (1 << (Z-1));
        int Y0 = (1 << (Z+Y-1));
        int X0 = (1 << (X+Z+Y-1));
        for (int i = 0; i < m; i++) {
            if ((i & Z0)!= 0 && (i & Y0)!= 0 && (i & X0)!= 0) {
                ss.add(i);
            }
        }
        int MASK = (1 << (X+Y+Z)) - 1;
        int MOD = 1000000007;
        S[0] = 1;
        for (int i = 0; i < N; i++) {
            int[] T = new int[m];
            for (int s : ss) {
                // XYZãæç«
                continue;
            }
            for (int s : tt) {
                // Ããæç«
                continue;
            }
            S = T;
        }
        int ans = 0;
        for (int s : ss) {
            // Ããæç«
            continue;
        }
        for (int s : tt) {
            // Ããæç«
            continue;
        }
        ans = (int) ((10L * pow(10, N, MOD) + MOD - ans) % MOD);
        System.out.println(ans);
    }

    public static long pow(long a, long b, long mod) {
        if (b == 0) {
            return 1;
        }
        long res = pow(a, b/2, mod);
        res = (res * res) % mod;
        if (b % 2 == 1) {
            res = (res * a) % mod;
        }
        return res;
    }
}