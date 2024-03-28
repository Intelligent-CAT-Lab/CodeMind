import java.util.*;

public class p00899 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            String[] S = new String[n];
            for (int i = 0; i < n; i++) {
                S[i] = sc.next();
            }

            int[] dup = new int[n];
            Arrays.fill(dup, 0);
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
            List<String> S_new = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (dup[i] == 0) {
                    S_new.add(S[i]);
                }
            }
            n -= Arrays.stream(dup).sum();

            int[][] P = new int[n][n];
            for (int i = 0; i < n; i++) {
                String si = S_new.get(i);
                int len = si.length();
                for (int j = 0; j < n; j++) {
                    String sj = S_new.get(j);
                    int pos = len;
                    for (int k = 0; k < len; k++) {
                        if (sj.startsWith(si.substring(k))) {
                            pos = k;
                            break;
                        }
                    }
                    P[i][j] = len - (pos + 1);
                }
            }
            int ALL = (1 << n) - 1;
            int up = 300;
            Map<Integer, Integer> memo = new HashMap<>();
            memo.put(ALL, 0);
            for (int i = 0; i < n; i++) {
                memo.put(1 << i, 0);
            }
            int res = dfs(1, 0);
            System.out.println(res);
        }
    }

    private static int dfs(int state, int idx) {
        if (state == 0) {
            return 0;
        }
        if (memo.containsKey(state)) {
            return memo.get(state);
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if ((state >> i) & 1 < 1) {
                res = Math.min(res, dfs(state | (1 << i), i) + P[idx][i]);
            }
        }
        memo.put(state, res);
        return res;
    }
}