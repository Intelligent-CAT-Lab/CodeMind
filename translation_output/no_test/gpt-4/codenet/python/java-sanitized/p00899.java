import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p00899 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n == 0) break;

            String[] S = new String[n];
            for (int i = 0; i < n; i++) {
                S[i] = scanner.nextLine();
            }

            boolean[] dup = new boolean[n];
            for (int i = 0; i < n; i++) {
                String si = S[i];
                for (int j = i + 1; j < n; j++) {
                    String sj = S[j];
                    if (si.contains(sj)) {
                        dup[j] = true;
                    }
                    if (sj.contains(si)) {
                        dup[i] = true;
                    }
                }
            }
            int dupCount = 0;
            String[] tempS = new String[n];
            for (int i = 0; i < n; i++) {
                if (!dup[i]) {
                    tempS[dupCount++] = S[i];
                }
            }
            S = Arrays.copyOf(tempS, dupCount);
            n -= dupCount;

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
            Map<Pair, Integer> memo = new HashMap<>();
            for (int i = 0; i < n; i++) {
                memo.put(new Pair(ALL, i), 0);
            }

            int min = up;
            for (int i = 0; i < n; i++) {
                min = Math.min(min, dfs(1 << i, i, P, n, memo) + S[i].length());
            }
            System.out.println(min);
        }
        scanner.close();
    }

    private static int dfs(int state, int i, int[][] P, int n, Map<Pair, Integer> memo) {
        Pair key = new Pair(state, i);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int res = 300;
        for (int j = 0; j < n; j++) {
            if (((state >> j) & 1) < 1) {
                res = Math.min(res, dfs(state | (1 << j), j, P, n, memo) + P[i][j]);
            }
        }
        memo.put(key, res);
        return res;
    }

    static class Pair {
        int state;
        int i;

        Pair(int state, int i) {
            this.state = state;
            this.i = i;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return state == pair.state && i == pair.i;
        }

        @Override
        public int hashCode() {
            return 31 * state + i;
        }
    }
}