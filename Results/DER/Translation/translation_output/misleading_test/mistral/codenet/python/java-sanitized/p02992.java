import java.util.*;

public class p02992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] ns = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            if (N < i * i) {
                break;
            }
            ns[i] = i;
            ns[i] = N / i;
        }
        Arrays.sort(ns);

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.length; i++) {
            m.put(ns[i], i);
        }

        int[] l = new int[ns.length];
        for (int i = 0; i < ns.length; i++) {
            l[i] = (N / ns[i]) - (N / ns[i + 1]);
        }

        int[][] dp = new int[K + 1][ns.length];
        dp[0][m.get(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.length - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
            }
            for (int j = 0, nn : ns) {
                int nj = m.get(N / nn);
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % 1000000007;
            }
        }

        int result = 0;
        for (int i : dp[K]) {
            result += i;
        }
        System.out.println(result % 1000000007);
    }
}