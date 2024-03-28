import java.util.*;

public class p04041 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int Y = in.nextInt();
        int Z = in.nextInt();
        int m = (int)Math.pow(2, X + Y + Z);
        long[] S = new long[m];
        int L = Math.max(X, Math.max(Y, Z));
        Set<Integer> ss = new HashSet<>();
        Set<Integer> tt = new HashSet<>();
        int Z0 = (1 << (Z - 1));
        int Y0 = (1 << (Z + Y - 1));
        int X0 = (1 << (X + Z + Y - 1));
        for (int i = 0; i < m; i++) {
            if ((i & Z0) != 0 && (i & Y0) != 0 && (i & X0) != 0) {
                ss.add(i);
            }
        }
        int MASK = (int)Math.pow(2, X + Y + Z) - 1;
        int MOD = (int)Math.pow(10, 9) + 7;
        S[0] = 1;
        for (int i = 0; i < N; i++) {
            long[] T = new long[m];
            for (int s = 0; s < m; s++) {
                if (ss.contains(s)) {
                    continue;
                }
                int b = (s << 1) | 1;
                for (int k = 1; k <= L; k++) {
                    int t = (b << (k - 1)) & MASK;
                    T[t] = (T[t] + S[s]) % MOD;
                }
                for (int k = L + 1; k <= 10; k++) {
                    T[0] = (T[0] + S[s]) % MOD;
                }
            }
            S = T;
        }
        long ans = 0;
        for (int s = 0; s < m; s++) {
            if (ss.contains(s)) {
                continue;
            }
            ans = (ans + S[s]) % MOD;
        }
        ans = (((long)Math.pow(10, N) % MOD) + MOD - ans) % MOD;
        System.out.println(ans);
    }
}