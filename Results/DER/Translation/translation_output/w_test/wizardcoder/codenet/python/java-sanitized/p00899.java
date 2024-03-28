import java.util.*;

public class p00899 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            List<String> S = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                S.add(sc.next());
            }

            boolean[] dup = new boolean[n];
            for (int i = 0; i < n; i++) {
                String si = S.get(i);
                for (int j = i+1; j < n; j++) {
                    String sj = S.get(j);
                    if (si.contains(sj)) {
                        dup[j] = true;
                    }
                    if (sj.contains(si)) {
                        dup[i] = true;
                    }
                }
            }
            S = new ArrayList<>(Arrays.asList(S.toArray(new String[0])));
            for (int i = 0; i < n; i++) {
                if (dup[i]) {
                    S.remove(i--);
                }
            }
            n -= Arrays.stream(dup).mapToInt(x -> x? 1 : 0).sum();

            int[][] P = new int[n][n];
            for (int i = 0; i < n; i++) {
                String si = S.get(i);
                int l = si.length();
                for (int j = 0; j < n; j++) {
                    String sj = S.get(j);
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
                res = Math.min(res, dfs(ALL, i, memo) + S.get(i).length());
            }
            System.out.println(res);
        }
    }

    private static int dfs(int state, int i, Map<Integer, Integer> memo) {
        if (memo.containsKey(state)) {
            return memo.get(state);
        }
        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state >> j) & 1 < 1) {
                res = Math.min(res, dfs(state | (1 << j), j, memo) + P[i][j]);
            }
        }
        memo.put(state, res);
        return res;
    }
}