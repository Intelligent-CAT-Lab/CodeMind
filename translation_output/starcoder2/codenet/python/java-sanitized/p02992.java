import java.util.*;
import java.io.*;

public class p02992 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = solve(N, K);
        out.println(result);
        out.close();
    }

    static int solve(int N, int K) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
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
        for (int i = 0; i < ns.size() - 1; i++) {
            l[i] = N / ns.get(i) - N / ns.get(i + 1);
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
            ans += dp[K][i];
        }
        return ans % MOD;
    }

    // PrintWriter for faster output
    public static PrintWriter out;

    // MyScanner class for faster input
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = solve(N, K);
        out.println(result);
        out.close();
    }

    static int solve(int N, int K) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
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
        for (int i = 0; i < ns.size() - 1; i++) {
            l[i] = N / ns.get(i) - N / ns.get(i + 1);
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
            ans += dp[K][i];
        }
        return ans % MOD;
    }

    // PrintWriter for faster output
    public static PrintWriter out;

    // MyScanner class for faster input
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

/2019-summer/2019-summer-contest-1/README.md
# 2019-summer-contest-1