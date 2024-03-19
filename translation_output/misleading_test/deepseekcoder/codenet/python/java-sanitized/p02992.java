import java.util.*;

public class p02992 {
    static final int MOD = (int)1e9 + 7;
    static int N, K;
    static List<Integer> ns = new ArrayList<>();
    static int[] l, m;
    static long[][] dp;

    static void solve(int n, int k) {
        N = n;
        K = k;
        ns.clear();
        for (int i = 1; ; ++i) {
            if (N < i * i) break;
            ns.add(i);
            ns.add(N / i);
        }
        Collections.sort(ns);
        ns = new ArrayList<>(new HashSet<>(ns));

        m = new int[N+1];
        l = new int[ns.size()];
        for (int i = 0; i < ns.size(); ++i) {
            m[ns.get(i)] = i;
            l[i] = (N / ns.get(i)) - (N / ns.get(i+1));
        }

        dp = new long[K+1][ns.size()];
        dp[0][m[N]] = 1;

        for (int i = 0; i < K; ++i) {
            for (int j = ns.size() - 2; j >= 0; --j) {
                dp[i][j] = (dp[i][j] + dp[i][j + 1]) % MOD;
            }
            for (int j = 0; j < ns.size(); ++j) {
                int nj = m[N / ns.get(j)];
                dp[i+1][j] = (dp[i+1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        solve(N, K);
        long ans = 0;
        for (int i = 0; i <= K; ++i) {
            ans = (ans + dp[i][0]) % MOD;
        }
        System.out.println(ans);
    }
}