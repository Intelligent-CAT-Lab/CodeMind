import java.util.*;
import java.io.*;

public class p00899 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while ((n = Integer.parseInt(br.readLine()))!= 0) {
            String[] S = new String[n];
            for (int i = 0; i < n; i++) {
                S[i] = br.readLine();
            }

            boolean[] dup = new boolean[n];
            for (int i = 0; i < n; i++) {
                String si = S[i];
                for (int j = i + 1; j < n; j++) {
                    String sj = S[j];
                    if (si.indexOf(sj)!= -1) {
                        dup[j] = true;
                    }
                    if (sj.indexOf(si)!= -1) {
                        dup[i] = true;
                    }
                }
            }
            S = Arrays.stream(S).filter(s ->!dup[S.indexOf(s)]).toArray(String[]::new);
            n -= Arrays.stream(dup).mapToInt(b -> b? 1 : 0).sum();

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
            for (int i = 0; i < n; i++) {
                memo.put((1 << i), 0);
            }
            int dfs(int state, int i) {
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
            System.out.println(Arrays.stream(S).mapToInt(s -> dfs(1 << S.indexOf(s), S.indexOf(s)) + s.length()).min().getAsInt());
        }
    }
}