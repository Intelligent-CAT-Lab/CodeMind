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
                    if (si.indexOf(sj) >= 0) {
                        dup[j] = 1;
                    }
                    if (sj.indexOf(si) >= 0) {
                        dup[i] = 1;
                    }
                }
            }
            List<String> filteredS = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (dup[i] == 0) {
                    filteredS.add(S[i]);
                }
            }
            n -= Arrays.stream(dup).sum();

            int[][] P = new int[n][n];
            for (int i = 0; i < n; i++) {
                String si = filteredS.get(i);
                int l = si.length();
                for (int j = 0; j < n; j++) {
                    String sj = filteredS.get(j);
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
            Map<List<Integer>, Integer> memo = new HashMap<>();
            for (int i = 0; i < n; i++) {
                List<Integer> key = new ArrayList<>();
                key.add(ALL);
                key.add(i);
                memo.put(key, 0);
            }

            System.out.println(dfs(memo, 1 << 0, 0, n, P, up, filteredS));
        }
        sc.close();
    }

    public static int dfs(Map<List<Integer>, Integer> memo, int state, int i, int n, int[][] P, int up, List<String> S) {
        List<Integer> key = new ArrayList<>();
        key.add(state);
        key.add(i);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state >> j & 1) < 1) {
                res = Math.min(res, dfs(memo, state | (1 << j), j, n, P, up, S) + P[i][j]);
            }
        }
        memo.put(key, res);
        return res;
    }
}