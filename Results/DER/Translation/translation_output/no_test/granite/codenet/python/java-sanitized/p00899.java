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
            for (int i = 0; i < n; i++) {
                String si = S[i];
                for (int j = i + 1; j < n; j++) {
                    String sj = S[j];
                    if (si.indexOf(sj)!= -1 || sj.indexOf(si)!= -1) {
                        dup[j] = 1;
                    }
                }
            }
            List<String> S2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (dup[i] == 0) {
                    S2.add(S[i]);
                }
            }
            n = S2.size();

            int[][] P = new int[n][n];
            for (int i = 0; i < n; i++) {
                String si = S2.get(i);
                int l = si.length();
                for (int j = 0; j < n; j++) {
                    String sj = S2.get(j);
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
            memo.put(ALL, 0);
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int state = (1 << i);
                int cost = S2.get(i).length();
                ans = Math.min(ans, dfs(state, i, P, cost, memo) + cost);
            }
            System.out.println(ans);
        }
    }

    static int dfs(int state, int i, int[][] P, int cost, Map<Integer, Integer> memo) {
        if (memo.containsKey(state)) {
            return memo.get(state);
        }
        int res = up;
        for (int j = 0; j < P.length; j++) {
            if ((state >> j) % 2 == 0) {
                res = Math.min(res, dfs(state | (1 << j), j, P, cost, memo) + P[i][j]);
            }
        }
        memo.put(state, res);
        return res;
    }
}