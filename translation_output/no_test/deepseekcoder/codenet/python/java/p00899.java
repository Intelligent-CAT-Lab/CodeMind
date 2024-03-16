<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
```

This Java code does the same thing as the Python code. It reads in a series of strings, removes duplicates, calculates a scoring matrix, and then uses dynamic programming to find the minimum total score. The code uses bitwise operations to keep track of the state of the strings, and a hash map to store previously computed results.
<|EOT|>
