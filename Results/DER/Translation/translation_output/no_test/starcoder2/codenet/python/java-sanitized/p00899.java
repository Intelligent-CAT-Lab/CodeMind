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
                    if (si.indexOf(sj) != -1) {
                        dup[j] = 1;
                    }
                    if (sj.indexOf(si) != -1) {
                        dup[i] = 1;
                    }
                }
            }
            List<String> S2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (dup[i] == 0) {
                    S2.add(S[i]);
                }
            }
            n -= Arrays.stream(dup).sum();

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
            Map<String, Integer> memo = new HashMap<>();
            for (int i = 0; i < n; i++) {
                memo.put(String.format("%d %d", ALL, i), 0);
            }
            int dfs(int state, int i) {
                String key = String.format("%d %d", state, i);
                if (memo.containsKey(key)) {
                    return memo.get(key);
                }
                int res = up;
                for (int j = 0; j < n; j++) {
                    if (((state >> j) & 1) < 1) {
                        res = Math.min(res, dfs(state | (1 << j), j) + P[i][j]);
                    }
                }
                memo.put(key, res);
                return res;
            }
            System.out.println(Arrays.stream(S2).mapToInt(s -> dfs(1 << S2.indexOf(s), S2.indexOf(s)) + s.length()).min().getAsInt());
        }
    }
}