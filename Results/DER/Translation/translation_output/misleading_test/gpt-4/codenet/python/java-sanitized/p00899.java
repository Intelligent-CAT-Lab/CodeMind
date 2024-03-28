import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class p00899 {
    private static int[] dup;
    private static String[] S;
    private static int n;
    private static int[][] P;
    private static Map<Long, Integer> memo;
    private static final int up = 300;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            n = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (n == 0) break;

            S = new String[n];
            for (int i = 0; i < n; i++) {
                S[i] = scanner.nextLine();
            }

            dup = new int[n];
            for (int i = 0; i < n; i++) {
                String si = S[i];
                for (int j = i + 1; j < n; j++) {
                    String sj = S[j];
                    if (si.contains(sj)) {
                        dup[j] = 1;
                    }
                    if (sj.contains(si)) {
                        dup[i] = 1;
                    }
                }
            }

            int counter = 0;
            for (int i = 0; i < n; i++) {
                if (dup[i] == 0) {
                    S[counter++] = S[i];
                }
            }
            n = counter;

            P = new int[n][n];
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

            long ALL = (1L << n) - 1;
            memo = new HashMap<>();
            for (int i = 0; i < n; i++) {
                memo.put(((ALL << 32) | i), 0);
            }
            int res = up;
            for (int i = 0; i < n; i++) {
                res = Math.min(res, dfs(1L << i, i) + S[i].length());
            }
            System.out.println(res);
        }
        scanner.close();
    }

    private static int dfs(long state, int i) {
        long encodedKey = (state << 32) | i;
        if (memo.containsKey(encodedKey)) {
            return memo.get(encodedKey);
        }
        int res = up;
        for (int j = 0; j < n; j++) {
            if (((state >> j) & 1) < 1) {
                res = Math.min(res, dfs(state | (1L << j), j) + P[i][j]);
            }
        }
        memo.put(encodedKey, res);
        return res;
    }
}