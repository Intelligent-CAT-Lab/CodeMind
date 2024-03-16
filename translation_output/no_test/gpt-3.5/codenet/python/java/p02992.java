```java
import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
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
        ns = new ArrayList<>(new HashSet<>(ns));
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
                dp[i][j] += dp[i][j + 1];
            }
            for (int j = 0; j < ns.size(); j++) {
                int nn = ns.get(j);
                int nj = m.get(N / nn);
                dp[i + 1][j] = (dp[i + 1][j] + (long) dp[i][nj] * l[j] % MOD) % MOD;
            }
        }

        int sum = 0;
        for (int num : dp[K]) {
            sum = (sum + num) % MOD;
        }

        return sum;
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
```
```
