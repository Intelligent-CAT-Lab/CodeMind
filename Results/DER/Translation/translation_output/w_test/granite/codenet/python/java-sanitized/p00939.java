import java.util.*;

public class p00939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = String.valueOf(D).length();
        int[] DI = new int[N];
        String DS = String.valueOf(D);
        for (int i = 0; i < N; i++) {
            DI[i] = DS.charAt(i) - '0';
        }
        int su = 0;
        for (int i = 0; i < N; i++) {
            su += DI[i];
        }
        int pd = 1;
        for (int i = 0; i < N; i++) {
            pd *= DI[i] + 1;
        }
        Map<String, Integer>[][] memo = new Map[N][su+1];
        int res1 = dfs0(0, su, 1, memo);
        Map<String, Integer>[][] memo1 = new Map[N][su+1];
        int res2 = dfs1(0, su, pd, 0, memo1) - 1;
        int ans = res1 + res2;
        System.out.println(ans);
    }

    public static int dfs0(int i, int s, int p, Map<String, Integer>[][] memo) {
        if (i == N) {
            return s > 0 || (s == 0 && p < pd);
        }
        if (memo[i].containsKey(s + "," + p)) {
            return memo[i].get(s + "," + p);
        }
        int r = 0;
        for (int v = 0; v <= Math.min(s, 9); v++) {
            r += dfs0(i+1, s-v, p*(v+1), memo);
        }
        memo[i].put(s + "," + p, r);
        return r;
    }

    public static int dfs1(int i, int s, int p, int m, Map<String, Integer>[][] memo) {
        if (i == N) {
            return s == 0 && p == 1;
        }
        if (memo[i].containsKey(s + "," + p + "," + m)) {
            return memo[i].get(s + "," + p + "," + m);
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
                r += dfs1(i+1, s-v, p/(v+1), +(v < di), memo);
            } else {
                r += dfs1(i+1, s-v, p/(v+1), 1, memo);
            }
        }
        memo[i].put(s + "," + p + "," + m, r);
        return r;
    }
}