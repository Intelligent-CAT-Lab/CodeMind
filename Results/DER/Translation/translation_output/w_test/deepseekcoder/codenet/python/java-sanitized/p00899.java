import java.util.*;

public class p00899 {
    static int[][] P;
    static int[] dup;
    static String[] S;
    static int n;
    static int up = 300;
    static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            S = new String[n];
            for (int i = 0; i < n; i++) {
                S[i] = scanner.next();
            }

            dup = new int[n];
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
            List<String> newS = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (dup[i] == 0) {
                    newS.add(S[i]);
                }
            }
            S = newS.toArray(new String[0]);
            n -= Arrays.stream(dup).sum();

            P = new int[n][n];
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
            memo.clear();
            for (int i = 0; i < n; i++) {
                memo.put(ALL << i, 0);
            }
            System.out.println(min(ALL, 0));
        }
    }

    static int min(int state, int i) {
        if (memo.containsKey(state << 1 | i)) {
            return memo.get(state << 1 | i);
        }
        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state & (1 << j)) == 0) {
                res = Math.min(res, min(state | (1 << j), j) + P[i][j]);
            }
        }
        memo.put(state << 1 | i, res);
        return res;
    }
}