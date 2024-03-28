import java.util.*;
import java.io.*;

public class p02992 {
    static final long MOD = 1000000007L;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokens.nextToken());
        int K = Integer.parseInt(tokens.nextToken());
        long result = solve(N, K);
        System.out.println(result);
    }

    private static long solve(int N, int K) {
        ArrayList<Integer> ns = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N < i * i) break;
            ns.add(i);
            if (i != N / i) {
                ns.add(N / i);
            }
        }
        Collections.sort(ns);
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.size(); i++) {
            m.put(ns.get(i), i);
        }

        int[] l = new int[ns.size()];
        for (int i = 0; i < ns.size() - 1; i++) {
            l[i] = (N / ns.get(i)) - (N / ns.get(i + 1));
        }
        l[ns.size() - 1] = 1;

        long[][] dp = new long[K + 1][ns.size()];
        dp[0][m.get(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
                dp[i][j] %= MOD;
            }
            for (int j = 0; j < ns.size(); j++) {
                int nj = m.get(N / ns.get(j));
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        long sum = 0;
        for (int i = 0; i < ns.size(); i++) {
            sum += dp[K][i];
            sum %= MOD;
        }
        return sum;
    }
}