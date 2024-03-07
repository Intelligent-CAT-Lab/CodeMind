import java.util.Scanner;

public class p00899 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            return;
        }
        String[] S = new String[n];
        for (int i = 0; i < n; i++) {
            S[i] = scanner.next();
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
        S = removeDuplicates(S, dup);
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
            res = Math.min(res, dfs(ALL, i, memo) + P[i][i]);
        }
        System.out.println(res);
    }

    private static int[] removeDuplicates(String[] S, int[] dup) {
        int[] result = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (dup[i] == 0) {
                result[j++] = S[i];
            }
        }
        return result;
    }

    private static int sum(int[] dup) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += dup[i];
        }
        return result;
    }

    private static int dfs(int state, int i, int[][] memo) {
        if (memo[state][i] != up) {
            return memo[state][i];
        }
        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state >> j) & 1 == 0) {
                res = Math.min(res, dfs(state | (1 << j), j, memo) + P[i][j]);
            }
        }
        memo[state][i] = res;
        return res;
    }
}




Please note that this is a naive implementation, and there are many optimizations that can be made to improve the performance of the algorithm.</s>