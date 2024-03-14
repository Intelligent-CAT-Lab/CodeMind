import java.util.*;

public class p00899 {
    static int[][] P;
    static int n;
    static String[] S;
    static boolean[] dup;
    static int ALL;
    static int up = 300;
    static HashMap<Integer, Integer> memo = new HashMap<>();

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

            dup = new boolean[n];
            for (int i = 0; i < n; i++) {
                String si = S[i];
                for (int j = i + 1; j < n; j++) {
                    String sj = S[j];
                    if (si.indexOf(sj) != -1) {
                        dup[j] = true;
                    }
                    if (sj.indexOf(si) != -1) {
                        dup[i] = true;
                    }
                }
            }

            ArrayList<String> newS = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (!dup[i]) {
                    newS.add(S[i]);
                }
            }
            S = newS.toArray(new String[0]);
            n -= Arrays.stream(dup).filter(b -> b).toArray().length;

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

            ALL = (1 << n) - 1;
            memo.clear();
            for (int i = 0; i < n; i++) {
                memo.put(ALL | (1 << i) | i, S[i].length());
            }

            System.out.println(min(ALL, 0));
        }
    }

    static int min(int state, int i) {
        if (memo.containsKey(state)) {
            return memo.get(state);
        }
        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state & (1 << j)) == 0) {
                res = Math.min(res, min(state | (1 << j), j) + P[i][j]);
            }
        }
        memo.put(state, res);
        return res;
    }
}