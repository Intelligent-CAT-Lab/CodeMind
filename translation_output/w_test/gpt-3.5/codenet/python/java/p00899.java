```java
import java.util.*;

public class Main {
    
    static Map<Integer, Integer> memo;
    
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
            memo = new HashMap<>();
            for (int i = 0; i < n; i++) {
                memo.put(ALL << 16 | i, 0);
            }
            System.out.println(Arrays.stream(filteredS.toArray(new String[0])).mapToInt(s -> {
                return minDfs(1 << i, i, n, P);
            }).min().getAsInt());
        }
        scanner.close();
    }
    
    public static int minDfs(int state, int i, int n, int[][] P) {
        if (memo.containsKey(state << 16 | i)) {
            return memo.get(state << 16 | i);
        }
        int res = 300;
        for (int j = 0; j < n; j++) {
            if ((state >> j & 1) < 1) {
                res = Math.min(res, minDfs(state | (1 << j), j, n, P) + P[i][j]);
            }
        }
        memo.put(state << 16 | i, res);
        return res;
    }
}
```
```
