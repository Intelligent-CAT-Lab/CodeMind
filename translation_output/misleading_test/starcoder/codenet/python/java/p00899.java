<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
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
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = dfs(ALL, i, memo, P, S, up);
            }
            System.out.println(Arrays.stream(res).min().getAsInt() + Arrays.stream(S).mapToInt(s -> s.length()).sum());
        }
    }

    private static int dfs(int state, int i, Map<Integer, Integer> memo, int[][] P, String[] S, int up) {
        if (memo.containsKey(state * n + i)) {
            return memo.get(state * n + i);
        }
        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state >> j) & 1 < 1) {
                res = Math.min(res, dfs(state | (1 << j), j, memo, P, S, up) + P[i][j]);
            }
        }
        memo.put(state * n + i, res);
        return res;
    }
}
```
'''
<|endoftext|>
