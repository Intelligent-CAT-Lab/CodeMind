import java.util.*;

public class p00939 {
    static int N;
    static int[] DI;
    static int su;
    static int pd = 1;
    static Map<String, Integer>[] memo;
    static Map<String, Integer>[] memo1;

    static boolean dfs0(int i, int s, int p) {
        String key = s + " " + p;
        if (i == N) {
            return s > 0 || (s == 0 && p < pd);
        }
        if (memo[i].containsKey(key)) {
            return memo[i].get(key);
        }
        int r = 0;
        for (int v = 0; v <= Math.min(s, 9); v++) {
            r += dfs0(i + 1, s - v, p * (v + 1));
        }
        memo[i].put(key, r);
        return r > 0;
    }

    static boolean dfs1(int i, int s, int p, int m) {
        String key = s + " " + p + " " + m;
        if (i == N) {
            return s == 0 && p == 1;
        }
        if (memo1[i].containsKey(key)) {
            return memo1[i].get(key);
        }
        int r = 0;
        int b = Math.max(s - (N - 1 - i) * 9, 0);
        for (int v = b; v <= Math.min(s, 9); v++) {
            if (p % (v + 1) != 0) {
                continue;
            }
            if (m == 0) {
                if (DI[i] < v) {
                    break;
                }
                r += dfs1(i + 1, s - v, p / (v + 1), DI[i] == v ? 0 : 1);
            } else {
                r += dfs1(i + 1, s - v, p / (v + 1), 1);
            }
        }
        memo1[i].put(key, r);
        return r > 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String D = in.next();
        N = D.length();
        DI = new int[N];
        for (int i = 0; i < N; i++) {
            DI[i] = D.charAt(i) - '0';
        }
        su = Arrays.stream(DI).sum();
        for (int d : DI) {
            pd *= d + 1;
        }
        memo = new HashMap[N];
        for (int i = 0; i < N; i++) {
            memo[i] = new HashMap<>();
        }
        boolean res1 = dfs0(0, su, 1);
        memo1 = new HashMap[N];
        for (int i = 0; i < N; i++) {
            memo1[i] = new HashMap<>();
        }
        boolean res2 = dfs1(0, su, pd, 0) - 1;
        int ans = (res1 ? 1 : 0) + (res2 ? 1 : 0);
        System.out.println(ans);
    }
}