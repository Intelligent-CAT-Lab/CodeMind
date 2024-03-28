import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p04041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        scanner.close();

        int m = (int) Math.pow(2, X + Y + Z);
        long[] S = new long[m];

        int L = Math.max(X, Math.max(Y, Z));

        Set<Integer> ss = new HashSet<>();
        int Z0 = 1 << (Z - 1);
        int Y0 = 1 << (Z + Y - 1);
        int X0 = 1 << (X + Z + Y - 1);

        for (int i = 0; i < m; i++) {
            if ((i & Z0) > 0 && (i & Y0) > 0 && (i & X0) > 0) {
                ss.add(i);
            }
        }

        int MASK = (int) Math.pow(2, X + Y + Z) - 1;
        int MOD = 1000000007;

        S[0] = 1;
        for (int i = 0; i < N; i++) {
            long[] T = new long[m];
            for (int s = 0; s < m; s++) {
                if (ss.contains(s)) {
                    // XYZ has been established
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
        
        ans = (powMod(10, N, MOD) + MOD - ans) % MOD;
        System.out.println(ans);
    }

    public static long powMod(long base, long exp, long mod) {
        long res = 1;
        base = base % mod;
        while (exp > 0) {
            if (exp % 2 == 1)
                res = (res * base) % mod;
            base = (base * base) % mod;
            exp = exp / 2;
        }
        return res;
    }
}