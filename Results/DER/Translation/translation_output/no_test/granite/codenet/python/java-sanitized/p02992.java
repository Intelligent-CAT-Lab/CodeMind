import java.util.*;
import java.io.*;

class Main {
    static int MOD = 1000000007;

    static int solve(int N, int K) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            ns.add(i);
            ns.add(N / i);
        }
        Collections.sort(ns);
        ns = new ArrayList<>(new HashSet<>(ns));
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.size(); i++) {
            m.put(ns.get(i), i);
        }
        int[] l = new int[ns.size()];
        for (int i = 0; i < ns.size() - 1; i++) {
            l[i] = (N / ns.get(i)) - (N / ns.get(i + 1));
        }

        int[][] dp = new int[K + 1][ns.size()];
        dp[0][m.get(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
            }
            for (int j = 0; j < ns.size(); j++) {
                int nj = m.get(N / ns.get(j));
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        int ans = 0;
        for (int i = 0; i < ns.size(); i++) {
            ans = (ans + dp[K][i]) % MOD;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(solve(N, K));
    }
}