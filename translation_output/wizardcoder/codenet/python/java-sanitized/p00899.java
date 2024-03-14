import java.util.*;

public class p00899 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            String[] S = new String[n];
            for (int i = 0; i < n; i++) {
                S[i] = sc.next();
            }

            boolean[] dup = new boolean[n];
            for (int i = 0; i < n; i++) {
                String si = S[i];
                for (int j = i+1; j < n; j++) {
                    String sj = S[j];
                    if (si.indexOf(sj)!= -1) {
                        dup[j] = true;
                    }
                    if (sj.indexOf(si)!= -1) {
                        dup[i] = true;
                    }
                }
            }
            List<String> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (!dup[i]) {
                    res.add(S[i]);
                }
            }
            S = res.toArray(new String[0]);
            n = S.length;

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
            Map<Integer, Integer> memo = new HashMap<>();
            int res = up;
            for (int i = 0; i < n; i++) {
                res = Math.min(res, dfs(ALL, i) + S[i].length());
            }
            System.out.println(res);
        }
    }

    private static int dfs(int state, int i) {
        if (memo.containsKey(state)) {
            return memo.get(state);
        }
        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state >> j) & 1 < 1) {
                res = Math.min(res, dfs(state | (1 << j), j) + P[i][j]);
            }
        }
        memo.put(state, res);
        return res;
    }
}