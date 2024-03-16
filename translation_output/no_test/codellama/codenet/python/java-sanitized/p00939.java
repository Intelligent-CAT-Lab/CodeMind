import java.util.Scanner;

public class p00939 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String D = scanner.nextLine();
        int N = D.length();
        int[] DI = new int[N];
        for (int i = 0; i < N; i++) {
            DI[i] = D.charAt(i) - '0';
        }
        int su = 0;
        for (int i = 0; i < N; i++) {
            su += DI[i];
        }
        int pd = 1;
        for (int i = 0; i < N; i++) {
            pd *= DI[i] + 1;
        }
        int[][] memo = new int[N][N];
        int[][] memo1 = new int[N][N];
        int res1 = dfs0(0, su, 1, memo);
        int res2 = dfs1(0, su, pd, 0, memo1) - 1;
        int ans = res1 + res2;
        System.out.println(ans);
    }

    private static int dfs0(int i, int s, int p, int[][] memo) {
        if (i == N) {
            return s > 0 || (s == 0 && p < pd);
        }
        int key = (s << 16) | p;
        if (memo[i][key] != 0) {
            return memo[i][key];
        }
        int r = 0;
        for (int v = Math.min(s, 9); v >= 0; v--) {
            r += dfs0(i + 1, s - v, p * (v + 1), memo);
        }
        memo[i][key] = r;
        return r;
    }

    private static int dfs1(int i, int s, int p, int m, int[][] memo1) {
        if (i == N) {
            return s == 0 && p == 1;
        }
        int key = (s << 16) | (p << 8) | m;
        if (memo1[i][key] != 0) {
            return memo1[i][key];
        }
        int r = 0;
        int b = s - (N - 1 - i) * 9;
        int di = DI[i];
        for (int v = Math.max(b, 0); v <= Math.min(s, 9); v++) {
            if (p % (v + 1) != 0) {
                continue;
            }
            if (m == 0) {
                if (di < v) {
                    break;
                }
                r += dfs1(i + 1, s - v, p / (v + 1), +(v < di), memo1);
            } else {
                r += dfs1(i + 1, s - v, p / (v + 1), 1, memo1);
            }
        }
        memo1[i][key] = r;
        return r;
    }
}