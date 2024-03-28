import java.util.*;

public class p00899 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            String[] S = new String[n];
            for (int i = 0; i < n; i++) {
                S[i] = scanner.next();
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
            ArrayList<String> newS = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (dup[i] == 0) {
                    newS.add(S[i]);
                }
            }
            n -= Arrays.stream(dup).sum();

            int[][] P = new int[n][n];
            for (int i = 0; i < n; i++) {
                String si = newS.get(i);
                int l = si.length();
                for (int j = 0; j < n; j++) {
                    String sj = newS.get(j);
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
            for (int state = 1; state <= ALL; state++) {
                for (int i = 0; i < n; i++) {
                    if (((state >> i) & 1) == 0) {
                        int res = up;
                        for (int j = 0; j < n; j++) {
                            if (((state >> j) & 1) == 0) {
                                res = Math.min(res, memo.get(state | (1 << j)) + P[i][j]);
                            }
                        }
                        memo.put(state, res);
                    }
                }
            }
            int min = up;
            for (int i = 0; i < n; i++) {
                min = Math.min(min, memo.get((1 << i)) + newS.get(i).length());
            }
            System.out.println(min);
        }
    }
}