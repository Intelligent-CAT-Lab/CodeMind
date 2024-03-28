import java.util.*;
import java.io.*;

public class p02992 {
    static final int MOD = 1000000007;

    public static int solve(int N, int K) {
        ArrayList<Integer> ns = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N < i * i) {
                break;
            }
            if (!ns.contains(i)) {
                ns.add(i);
            }
            if (!ns.contains(N / i)) {
                ns.add(N / i);
            }
        }
        Collections.sort(ns);

        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.size(); i++) {
            m.put(ns.get(i), i);
        }
        
        int[] l = new int[ns.size()];
        Arrays.fill(l, 1);

        for (int i = 0, s, b; i < ns.size() - 1; i++) {
            s = ns.get(i);
            b = ns.get(i + 1);
            l[i] = (N / s) - (N / b);
        }

        int[][] dp = new int[K+1][ns.size()];
        dp[0][m.get(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
                dp[i][j] %= MOD;
            }
            for (int j = 0; j < ns.size(); j++) {
                int nn = ns.get(j);
                int nj = m.get(N / nn);
                dp[i+1][j] = (int)((dp[i+1][j] + (long)dp[i][nj] * l[j]) % MOD);
            }
        }

        long result = 0;
        for (int x: dp[K]) {
            result += x;
            result %= MOD;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();  
        int K = input.nextInt();  
        int result = solve(N, K);
        System.out.println(result);
    }
}