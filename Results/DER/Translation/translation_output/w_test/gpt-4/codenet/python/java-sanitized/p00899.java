import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p00899 {
    
    private static final int up = 300;
    private static Map<Pair<Integer, Integer>, Integer> memo;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n == 0) {
                break;
            }

            String[] S = new String[n];
            for (int i = 0; i < n; i++) {
                S[i] = scanner.nextLine();
            }

            int[] dup = new int[n];
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

            String[] newS = Arrays.stream(S).filter(si -> dup[Arrays.asList(S).indexOf(si)] == 0).toArray(String[]::new);
            n = newS.length;

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

            memo = new HashMap<>();
            for (int i = 0; i < n; i++)
                memo.put(new Pair<>(ALL, i), 0);

            int res = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                res = Math.min(res, dfs(1 << i, i) + newS[i].length());
            }
            System.out.println(res);
        }
        scanner.close();
    }

    private static int dfs(int state, int i) {
        Pair<Integer, Integer> key = new Pair<>(state, i);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int res = up;
        for (int j = 0; j < memo.size(); j++) {
            if (((state >> j) & 1) < 1) {
                res = Math.min(res, dfs(state | (1 << j), j) + P[i][j]);
            }
        }
        memo.put(key, res);
        return res;
    }
    
    static class Pair<A, B> {
        private A first;
        private B second;
        
        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
        
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return first.equals(pair.first) && second.equals(pair.second);
        }
        
        @Override
        public int hashCode() {
            return 31 * first.hashCode() + second.hashCode();
        }
    }

    private static int[][] P; // This has to be static because it's being accessed in a static method (dfs)
}