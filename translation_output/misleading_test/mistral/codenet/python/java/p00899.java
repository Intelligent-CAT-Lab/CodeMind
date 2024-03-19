<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-57

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
            List<String> S = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                S.add(sc.next());
            }

            int[] dup = new int[n];
            Arrays.fill(dup, 0);
            for (int i = 0; i < n; i++) {
                String si = S.get(i);
                for (int j = i + 1; j < n; j++) {
                    String sj = S.get(j);
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
                    S_new.add(S.get(i));
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
                    P[i][j] = len - (len - pos);
                }
            }
            int ALL = (1 << n) - 1;
            int up = 300;
            Map<Integer, Integer> memo = new HashMap<>();
            int min_val = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int state = 1 << i;
                int res = up;
                for (int j = 0; j < n; j++) {
                    if ((state >> j) & 1 < 1) {
                        res = Math.min(res, dfs(state | (1 << j), j) + P[i][j]);
                    }
                }
                memo.put(state, res);
                min_val = Math.min(min_val, res);
            }
            System.out.println(min_val);
        }
    }

    private static int dfs(int state, int i) {
        if ((state, i) == memo.entrySet().iterator().next()) {
            return memo.get(state, i);
        }
        int res = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if ((state >> j) & 1 < 1) {
                res = Math.min(res, dfs(state | (1 << j), j) + P[i][j]);
            }
        }
        memo.put(state, res);
        return res;
    }
}
```</s>
