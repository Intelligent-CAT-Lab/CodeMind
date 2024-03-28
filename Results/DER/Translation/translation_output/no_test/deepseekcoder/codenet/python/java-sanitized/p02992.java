import java.util.*;

public class p02992 {
    static int MOD = (int)1e9 + 7;

    static int solve(int N, int K) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N < i * i)
                break;
            ns.add(i);
            ns.add(N / i);
        }
        Collections.sort(ns);
        ns = new ArrayList<>(new LinkedHashSet<>(ns));

        Map<Integer, Integer> m = new HashMap<>();
        int[] l = new int[ns.size()];
        for (int i = 0; i < ns.size(); i++) {
            l[i] = 1;
        }
        for (int i = 0; i < ns.size(); i++) {
            l[i] = (N / ns.get(i));
        }

        long[][] dp = new long[K+1][ns.size()];
        dp[0][ns.indexOf(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
            }
            for (int j = 0; j < ns.size(); j++) {
                int nj = ns.indexOf(N / ns.get(j));
                dp[i+1][j] = (dp[i+1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        long sum = 0;
        for (int i = 0; i <= K; i++) {
            sum = (sum + dp[i][0]) % MOD;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = solve(N, K);
        System.out.println(result);
    }
}