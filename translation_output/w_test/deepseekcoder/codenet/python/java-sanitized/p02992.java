import java.util.*;

public class p02992 {
    static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(solve(N, K));
    }

    static int solve(int N, int K) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N < i * i) break;
            ns.add(i);
            ns.add(N / i);
        }
        Collections.sort(ns);
        ns = new ArrayList<>(new HashSet<>(ns));

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.size(); i++) m.put(ns.get(i), i);

        int[] l = new int[ns.size()];
        for (int i = 0; i < ns.size() - 1; i++) {
            l[i] = N / ns.get(i) - N / ns.get(i + 1);
        }

        long[][] dp = new long[K+1][ns.size()];
        dp[0][m.get(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i][j] = (dp[i][j] + dp[i][j + 1]) % MOD;
            }
            for (int j = 0; j < ns.size(); j++) {
                int nj = m.get(N / ns.get(j));
                dp[i+1][j] = (dp[i+1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        long sum = 0;
        for (int i = 0; i <= K; i++) {
            sum = (sum + dp[i][0]) % MOD;
        }
        return (int)sum;
    }
}