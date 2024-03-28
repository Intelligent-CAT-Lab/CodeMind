import java.util.*;

public class p00939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] DI = new int[N];
        for (int i = 0; i < N; i++) {
            DI[i] = sc.nextInt();
        }
        int su = Arrays.stream(DI).sum();
        int pd = 1;
        for (int d : DI) {
            pd *= (d + 1);
        }
        int[] memo = new int[N];
        Arrays.fill(memo, 0);
        int res1 = dfs0(0, su, 1);
        int[] memo1 = new int[N];
        Arrays.fill(memo1, 0);
        int res2 = dfs1(0, su, pd, 0);
        int ans = res1 + res2;
        System.out.println(ans);
    }

    public static int dfs0(int i, int s, int p) {
        int key = (s, p);
        if (i == N) {
            return s > 0 || (s == 0 && p < pd);
        }
        if (memo[i][key] != 0) {
            return memo[i][key];
        }
        int r = 0;
        for (int v = 1; v <= 9; v++) {
            r += dfs0(i + 1, s - v, p * (v + 1));
        }
        memo[i][key] = r;
        return r;
    }

    public static int dfs1(int i, int s, int p, int m) {
        int key = (s, p, m);
        if (i == N) {
            return s == 0 && p == 1;
        }
        if (memo1[i][key] != 0) {
            return memo1[i][key];
        }
        int r = 0;
        int b = s - (N - 1 - i) * 9;
        int di = DI[i];
        for (int v = 1; v <= 9; v++) {
            if (p % (v + 1)) {
                continue;
            }
            if (m == 0) {
                if (di < v) {
                    break;
                }
                r += dfs1(i + 1, s - v, p / (v + 1), (v < di));
            } else {
                r += dfs1(i + 1, s - v, p / (v + 1), 1);
            }
        }
        memo1[i][key] = r;
        return r;
    }
}