import java.util.*;

public class p00939 {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        String D = System.console().readLine();
        int N = D.length();
        int[] DI = new int[N];
        for (int i = 0; i < N; i++) {
            DI[i] = Character.getNumericValue(D.charAt(i));
        }
        int su = Arrays.stream(DI).sum();
        int pd = 1;
        for (int d : DI) {
            pd *= d + 1;
        }
        Map<String, Integer>[] memo = new Map[N];
        for (int i = 0; i < N; i++) {
            memo[i] = new HashMap<>();
        }
        dfs0(0, su, 1, memo);
        Map<String, Integer>[] memo1 = new Map[N];
        for (int i = 0; i < N; i++) {
            memo1[i] = new HashMap<>();
        }
        int res1 = dfs0(0, su, pd, memo);
        int res2 = dfs1(0, su, pd, 0, memo1) - 1;
        int ans = res1 + res2;
        System.out.println(ans);
    }

    public static int dfs0(int i, int s, int p, Map<String, Integer>[] memo) {
        String key = i + "," + s + "," + p;
        if (i == N) {
            return s > 0 || (s == 0 && p < pd);
        }
        if (memo[i].containsKey(key)) {
            return memo[i].get(key);
        }
        int r = 0;
        for (int v = Math.min(s, 9); v >= 0; v--) {
            r += dfs0(i + 1, s - v, p * (v +