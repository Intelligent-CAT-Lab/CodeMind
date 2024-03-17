Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
16


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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            List<String> S = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                S.add(sc.next());
            }

            boolean[] dup = new boolean[n];
            for (int i = 0; i < n; i++) {
                String si = S.get(i);
                for (int j = i+1; j < n; j++) {
                    String sj = S.get(j);
                    if (si.contains(sj)) {
                        dup[j] = true;
                    }
                    if (sj.contains(si)) {
                        dup[i] = true;
                    }
                }
            }
            S = new ArrayList<>(Arrays.asList(S.toArray(new String[0])));
            for (int i = 0; i < n; i++) {
                if (dup[i]) {
                    S.remove(i--);
                }
            }
            n -= Arrays.stream(dup).mapToInt(x -> x? 1 : 0).sum();

            int[][] P = new int[n][n];
            for (int i = 0; i < n; i++) {
                String si = S.get(i);
                int l = si.length();
                for (int j = 0; j < n; j++) {
                    String sj = S.get(j);
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
            int res = up;
            for (int i = 0; i < n; i++) {
                res = Math.min(res, dfs(ALL, i, memo) + S.get(i).length());
            }
            System.out.println(res);
        }
    }

    private static int dfs(int state, int i, Map<Integer, Integer> memo) {
        if (memo.containsKey(state)) {
            return memo.get(state);
        }
        int res = up;
        for (int j = 0; j < n; j++) {
            if ((state >> j) & 1 < 1) {
                res = Math.min(res, dfs(state | (1 << j), j, memo) + P[i][j]);
            }
        }
        memo.put(state, res);
        return res;
    }
}
```<|endoftext|>
