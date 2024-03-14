import java.util.*;

public class p00939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String D = sc.nextLine();
        int N = D.length();
        int[] DI = new int[N];
        for (int i = 0; i < N; i++) {
            DI[i] = D.charAt(i) - '0';
        }
        int su = 0;
        for (int d : DI) {
            su += d;
        }
        int pd = 1;
        for (int d : DI) {
            pd *= d + 1;
        }
        int[][] memo = new int[N][];
        for (int i = 0; i < N; i++) {
            memo[i] = new int[1001];
        }
        int res1 = dfs0(0, su, 1, memo);
        int[][] memo1 = new int[N][];
        for (int i = 0; i < N; i++) {
            memo1[i] = new int[1001][2];
        }
        int res2 = dfs1(0, su, pd, 0, memo1) - 1;
        int ans = res1 + res2;
        System.out.println(ans);
    }

    public static int dfs0(int i, int s, int p, int[][] memo) {
        if (i == N) {
            return s > 0 || (s == 0 && p < pd);
        }
        if (memo[i][s]!= 0) {
            return memo[i][s];
        }
        int r = 0;
        for (int v = Math.min(s, 9); v >= 0; v--) {
            r += dfs0(i+1, s-v, p*(v+1), memo);
        }
        memo[i][s] = r;
        return r;
    }

    public static int dfs1(int i, int s, int p, int m, int[][] memo) {
        if (i == N) {
            return s == 0 && p == 1;
        }
        if (memo[i][s][m]!= 0) {
            return memo[i][s][m];
        }
        int r = 0;
        int b = s - (N-1-i)*9;
        int di = DI[i];
        for (int v = Math.max(b, 0); v <= Math.min(s, 9); v++) {
            if (p % (v+1)!= 0) {
                continue;
            }
            if (m == 0) {
                if (di < v) {
                    break;
                }
                r += dfs1(i+1, s-v, p//(v+1), +(v < di), memo);
            } else {
                r += dfs1(i+1, s-v, p//(v+1), 1, memo);
            }
        }
        memo[i][s][m] = r;
        return r;
    }
}