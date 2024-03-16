```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
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
                    if (si.indexOf(sj) != -1) {
                        dup[j] = 1;
                    }
                    if (sj.indexOf(si) != -1) {
                        dup[i] = 1;
                    }
                }
            }

            String[] newS = new String[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (dup[i] == 0) {
                    newS[count++] = S[i];
                }
            }

            n -= count;

            int[][] P = new int[n][n];
            for (int i = 0; i < n; i++) {
                String si = newS[i];
                int l = si.length();
                for (int j = 0; j < n; j++) {
                    String sj = newS[j];
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
            int[][] memo = new int[ALL + 1][n];

            System.out.println(minDfs(1 << i, i, ALL, n, P, memo, up, n, newS) + newS[i].length());
        }
    }

    public static int minDfs(int state, int i, int ALL, int n, int[][] P, int[][] memo, int up, int size, String[] S) {
        if (memo[state][i] != 0) {
            return memo[state][i];
        }

        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state >> j & 1) < 1) {
                res = Math.min(res, minDfs(state | (1 << j), j, ALL, n, P, memo, up, size, S) + P[i][j]);
            }
        }

        memo[state][i] = res;
        return res;
    }
}
```
