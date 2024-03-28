import java.util.Scanner;

public class p04041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int m = (int) Math.pow(2, X + Y + Z);
        int[] S = new int[m];
        int L = Math.max(X, Y, Z);
        int Z0 = (int) Math.pow(2, Z - 1);
        int Y0 = (int) Math.pow(2, Z + Y - 1);
        int X0 = (int) Math.pow(2, X + Z + Y - 1);
        Set<Integer> ss = new HashSet<>();
        Set<Integer> tt = new HashSet<>();
        for (int i = 0; i < m; i++) {
            if ((i & Z0) && (i & Y0) && (i & X0)) {
                ss.add(i);
            }
        }
        int MASK = (int) Math.pow(2, X + Y + Z) - 1;
        int MOD = 1000000007;
        S[0] = 1;
        for (int i = 0; i < N; i++) {
            int[] T = new int[m];
            for (int s = 0; s < m; s++) {
                if (s in ss) {
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
        int ans = 0;
        for (int s = 0; s < m; s++) {
            if (s in ss) {
                continue;
            }
            ans = (ans + S[s]) % MOD;
        }
        ans = (int) Math.pow(10, N) + MOD - ans;
        System.out.println(ans);
    }
}