import java.util.Scanner;

public class p00899 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] S = new String[n];
        for (int i = 0; i < n; i++) {
            S[i] = scanner.nextLine();
        }

        int[] dup = new int[n];
        for (int i = 0; i < n; i++) {
            String si = S[i];
            for (int j = i + 1; j < n; j++) {
                String sj = S[j];
                if (si.indexOf(sj) + 1 > 0) {
                    dup[j] = 1;
                }
                if (sj.indexOf(si) + 1 > 0) {
                    dup[i] = 1;
                }
            }
        }
        S = new String[n];
        for (int i = 0; i < n; i++) {
            if (dup[i] == 0) {
                S[i] = S[i];
            }
        }
        n -= sum(dup);

        int[][] P = new int[n][n];
        for (int i = 0; i < n; i++) {
            String si = S[i];
            int l = si.length();
            for (int j = 0; j < n; j++) {
                String sj = S[j];
                int pos = l;
                for (int k = 0; k < l; k++) {
                    if (sj.startsWith(si.substring(k))) {
                        pos = k;
                        break;
                    }
                }
                P[i][j] = sj.length() - (l - pos);
            }
        }

        int ALL = (1 << n) - 1;
        int up = 300;
        int[][] memo = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = up;
            }
        }
        int res = up;
        for (int i = 0; i < n; i++) {
            res = Math.min(res, dfs(ALL, i) + P[i][i]);
        }
        System.out.println(res);
    }

    private static int dfs(int state, int i) {
        if (memo[state][i] != up) {
            return memo[state][i];
        }
        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state >> j) & 1 == 0) {
                res = Math.min(res, dfs(state | (1 << j), j) + P[i][j]);
            }
        }
        memo[state][i] = res;
        return res;
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}