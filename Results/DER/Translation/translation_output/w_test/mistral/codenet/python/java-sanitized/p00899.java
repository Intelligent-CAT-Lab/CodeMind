import java.util.*;

public class p00899 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            List<String> S = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                S.add(sc.next());
            }

            int[] dup = new int[n];
            Arrays.fill(dup, 0);
            for (int i = 0; i < n; i++) {
                String si = S.get(i);
                for (int j = i + 1; j < n; j++) {
                    String sj = S.get(j);
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
                    S_new.add(S.get(i));
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
                    P[i][j] = len - (len - pos);
                }
            }
            int ALL = (1 << n) - 1;
            int up = 300;
            Map<Integer, Integer> memo = new HashMap<>();
            int res = dfs(1 << i, i, ALL, P, n);
            System.out.println(res);
        }
    }

    private static int dfs(int state, int i, int ALL, int[][] P, int n) {
        if ((state, i) == memo.entrySet().iterator().next()) {
            return memo.get(state, i);
        }
        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state >> j) & 1 < 1) {
                res = Math.min(res, dfs(state | (1 << j), j, ALL, P, n) + P[i][j]);
            }
        }
        memo.put(state, i, res);
        return res;
    }
}