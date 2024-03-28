<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
while 1:
    n = int(input())
    if n == 0:
        break
    S = [input() for i in range(n)]

    dup = [0]*n
    for i in range(n):
        si = S[i]
        for j in range(i+1, n):
            sj = S[j]
            if si.find(sj)+1:
                dup[j] = 1
            if sj.find(si)+1:
                dup[i] = 1
    S = [S[i] for i in range(n) if not dup[i]]
    n -= sum(dup)

    P = [[0]*n for i in range(n)]
    for i in range(n):
        si = S[i]
        l = len(si)
        for j in range(n):
            sj = S[j]
            pos = l
            for k in range(l):
                if sj.startswith(si[k:]):
                    pos = k
                    break
            P[i][j] = len(sj) - (l - pos)

    ALL = 2**n - 1
    up = 300
    memo = {(ALL, i): 0 for i in range(n)}
    def dfs(state, i):
        if (state, i) in memo:
            return memo[state, i]
        res = up
        for j in range(n):
            if (state >> j) & 1 < 1:
                res = min(res, dfs(state | (1 << j), j) + P[i][j])
        memo[state, i] = res
        return res
    print(min(dfs(1 << i, i) + len(S[i]) for i in range(n)))
```
[/INST]
```java
import java.util.*;

public class Main {
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
            Arrays.fill(dup, 0);
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
            List<String> S_new = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (dup[i] == 0) {
                    S_new.add(S[i]);
                }
            }
            n -= Arrays.stream(dup).sum();

            int[][] P = new int[n][n];
            for (int i = 0; i < n; i++) {
                String si = S_new.get(i);
                int len = si.length();
                for (int j = 0; j < n; j++) {
                    String sj = S_new.get(j);
                    int pos = len;
                    for (int k = 0; k < len; k++) {
                        if (sj.startsWith(si.substring(k))) {
                            pos = k;
                            break;
                        }
                    }
                    P[i][j] = len - (pos + 1);
                }
            }
            int ALL = (1 << n) - 1;
            int up = 300;
            Map<Integer, Integer> memo = new HashMap<>();
            memo.put(ALL, 0);
            for (int i = 0; i < n; i++) {
                memo.put(1 << i, 0);
            }
            int res = dfs(1, 0);
            System.out.println(res);
        }
    }

    private static int dfs(int state, int idx) {
        if (state == 0) {
            return 0;
        }
        if (memo.containsKey(state)) {
            return memo.get(state);
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if ((state >> i) & 1 < 1) {
                res = Math.min(res, dfs(state | (1 << i), i) + P[idx][i]);
            }
        }
        memo.put(state, res);
        return res;
    }
}
```</s>
