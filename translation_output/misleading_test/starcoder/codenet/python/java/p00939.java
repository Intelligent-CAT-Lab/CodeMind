<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
-46

```
def solve():
    D = input()
    N = len(D)
    *DI, = map(int, D)
    su = sum(DI)
    pd = 1
    for d in D:
        pd *= int(d) + 1
    memo = [{} for i in range(N)]
    def dfs0(i, s, p):
        key = (s, p)
        if i == N:
            return s > 0 or (s == 0 and p < pd)
        if key in memo[i]:
            return memo[i][key]
        r = 0
        for v in range(min(s, 9)+1):
            r += dfs0(i+1, s-v, p*(v+1))
        memo[i][key] = r
        return r
    res1 = dfs0(0, su, 1)
    memo1 = [{} for i in range(N)]
    def dfs1(i, s, p, m):
        key = (s, p, m)
        if i == N:
            return s == 0 and p == 1
        if key in memo1[i]:
            return memo1[i][key]
        r = 0
        b = s - (N-1-i)*9
        di = DI[i]
        for v in range(max(b, 0), min(s, 9)+1):
            if p % (v+1):
                continue
            if m == 0:
                if di < v:
                    break
                r += dfs1(i+1, s-v, p//(v+1), +(v < di))
            else:
                r += dfs1(i+1, s-v, p//(v+1), 1)
        memo1[i][key] = r
        return r
    res2 = dfs1(0, su, pd, 0) - 1
    ans = res1 + res2
    print(ans)
solve()

```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = (int) Math.log10(D) + 1;
        int[] DI = new int[N];
        for (int i = 0; i < N; i++) {
            DI[i] = D % 10;
            D /= 10;
        }
        int su = 0;
        for (int i = 0; i < N; i++) {
            su += DI[i];
        }
        int pd = 1;
        for (int i = 0; i < N; i++) {
            pd *= (DI[i] + 1);
        }
        int[][] memo = new int[N][];
        for (int i = 0; i < N; i++) {
            memo[i] = new int[su+1];
        }
        int res1 = dfs0(0, su, 1);
        int[][] memo1 = new int[N][];
        for (int i = 0; i < N; i++) {
            memo1[i] = new int[su+1];
        }
        int res2 = dfs1(0, su, pd, 0) - 1;
        int ans = res1 + res2;
        System.out.println(ans);
    }
    public static int dfs0(int i, int s, int p) {
        if (i == N) {
            return s > 0 || (s == 0 && p < pd);
        }
        if (memo[i][s]!= 0) {
            return memo[i][s];
        }
        int r = 0;
        for (int v = Math.min(s, 9) + 1; v >= 0; v--) {
            r += dfs0(i+1, s-v, p*(v+1));
        }
        memo[i][s] = r;
        return r;
    }
    public static int dfs1(int i, int s, int p, int m) {
        if (i == N) {
            return s == 0 && p == 1;
        }
        if (memo1[i][s]!= 0) {
            return memo1[i][s];
        }
        int r = 0;
        int b = s - (N-1-i)*9;
        int di = DI[i];
        for (int v = Math.max(b, 0); v <= Math.min(s, 9); v++) {
            if (p % (v+1)!= 0) {
                continue;
            }
            if (m == 0) {
                if (di < v) {
                    break;
                }
                r += dfs1(i+1, s-v, p//(v+1), +(v < di));
            } else {
                r += dfs1(i+1, s-v, p//(v+1), 1);
            }
        }
        memo1[i][s] = r;
        return r;
    }
}
```

'''
<|endoftext|>
