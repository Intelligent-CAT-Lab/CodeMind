import java.util.*;
import java.io.*;

public class p00899 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            String[] S = new String[n];
            for (int i = 0; i < n; i++) S[i] = br.readLine();

            boolean[] dup = new boolean[n];
            for (int i = 0; i < n; i++) {
                String si = S[i];
                for (int j = i + 1; j < n; j++) {
                    String sj = S[j];
                    if (si.indexOf(sj)!= -1) dup[j] = true;
                    if (sj.indexOf(si)!= -1) dup[i] = true;
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
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = dfs(ALL, i);
            }
            bw.write(Arrays.stream(res).min().getAsInt() + "\n");
        }
        bw.close();
    }

    public static int dfs(int state, int i) {
        if (memo.containsKey(state * 100 + i)) return memo.get(state * 100 + i);
        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state >> j) & 1 < 1) {
                res = Math.min(res, dfs(state | (1 << j), j) + P[i][j]);
            }
        }
        memo.put(state * 100 + i, res);
        return res;
    }
}