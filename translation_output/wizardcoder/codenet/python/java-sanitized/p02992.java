import java.util.*;

public class p02992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = solve(N, K);
        System.out.println(result);
    }

    public static int solve(int N, int K) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            ns.add(i);
            if (N % i == 0) {
                ns.add(N / i);
            }
        }
        Collections.sort(ns);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.size(); i++) {
            m.put(ns.get(i), i);
        }
        int[] l = new int[ns.size()];
        for (int i = 0; i < ns.size() - 1; i++) {
            int s = ns.get(i);
            int b = ns.get(i + 1);
            l[i] = (N / s) - (N / b);
        }

        int[][] dp = new int[K + 1][ns.size()];
        dp[0][m.get(N)] = 1;
        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][j + 1]) % MOD;
            }
            for (int j = 0; j < ns.size(); j++) {
                int nn = N / ns.get(j);
                int nj = m.get(nn);
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        int sum = 0;
        for (int i = 0; i < ns.size(); i++) {
            sum = (sum + dp[K][i]) % MOD;
        }
        return sum;
    }
}