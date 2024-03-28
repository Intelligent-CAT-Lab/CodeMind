import java.util.HashSet;
import java.util.Scanner;

public class p04041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int m = 1 << (X + Y + Z);
        int[] S = new int[m];

        int L = Math.max(X, Math.max(Y, Z));

        HashSet<Integer> ss = new HashSet<>();

        int Z0 = 1 << (Z - 1);
        int Y0 = 1 << (Z + Y - 1);
        int X0 = 1 << (X + Z + Y - 1);

        for (int i = 0; i < m; i++) {
            if ((i & Z0) != 0 && (i & Y0) != 0 && (i & X0) != 0) {
                ss.add(i);
            }
        }

        int MASK = (1 << (X + Y + Z)) - 1;
        int MOD = 1000000007;

        S[0] = 1;
        for (int i = 0; i < N; i++) {
            int[] T = new int[m];
            for (int s = 0; s < m; s++) {
                if (!ss.contains(s)) {
                    int b = (s << 1) | 1;
                    for (int k = 1; k <= L; k++) {
                        int t = (b << (k - 1)) & MASK;
                        T[t] = (T[t] + S[s]) % MOD;
                    }
                    for (int k = L + 1; k <= 10; k++) {
                        T[0] = (T[0] + S[s]) % MOD;
                    }
                }
            }
            S = T;
        }
        int ans = 0;
        for (int s = 0; s < m; s++) {
            if (!ss.contains(s)) {
                ans = (ans + S[s]) % MOD;
            }
        }
        ans = (int) ((power(10, N, MOD) + MOD - ans) % MOD);
        System.out.println(ans);
        sc.close();
    }

    private static long power(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) != 0)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }
}