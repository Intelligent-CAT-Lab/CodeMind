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
        S[0] = 1;
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
        for (int i = 0; i < N; i++) {
            int[] T = new int[m];
            for (int s : ss) {
                // XYZãæç«
                continue;
            }
            for (int s : tt) {
                // XYZãæç«
                continue;
            }
            for (int s = 0; s < m; s++) {
                if (s == 0) {
                    T[0] = (T[0] + S[s]) % MOD;
                    continue;
                }
                int b = (s << 1) | 1;
                for (int k = 1; k <= L; k++) {
                    int t = (b << (k-1)) & MASK;
                    T[t] = (T[t] + S[s]) % MOD;
                }
                for (int k = L+1; k <= 10; k++) {
                    T[0] = (T[0] + S[s]) % MOD;
                }
            }
            S = T;
        }
        int ans = 0;
        for (int s : ss) {
            // XYZãæç«
            continue;
        }
        for (int s : tt) {
            // XYZãæç«
            continue;
        }
        for (int s = 0; s < m; s++) {
            if (s == 0) {
                ans = (ans + S[s]) % MOD;
                continue;
            }
            ans = (ans + S[s]) % MOD;
        }
        ans = (int) ((Math.pow(10, N) + MOD - ans) % MOD);
        System.out.println(ans);
    }
}