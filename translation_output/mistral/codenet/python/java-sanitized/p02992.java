import java.util.*;

public class p02992 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tokens = new ArrayList<>();
        while (scanner.hasNext()) {
            String token = scanner.next();
            tokens.add(token);
        }
        int N = Integer.parseInt(tokens.get(0));
        int K = Integer.parseInt(tokens.get(1));
        int result = solve(N, K);
        System.out.println(result);
    }

    public static int solve(int N, int K) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N < i * i) {
                break;
            }
            ns.add(i);
            ns.add(N / i);
        }
        Collections.sort(ns);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.size(); i++) {
            m.put(ns.get(i), i);
        }
        int[] l = new int[ns.size()];
        Arrays.fill(l, 1);
        for (int i = 1; i < ns.size(); i++) {
            l[i] = (N / ns.get(i - 1)) - (N / ns.get(i));
        }
        int[][] dp = new int[K + 1][ns.size()];
        Arrays.fill(dp[0], 1);
        for (int i = 1; i <= K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
            }
            for (int j = 0; j < ns.size() - 2; j++) {
                int nn = ns.get(j);
                int nj = m.get(N / nn);
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % 1000000007;
            }
        }
        return Arrays.stream(dp[K]).sum() % 1000000007;
    }
}