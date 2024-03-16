
```
import sys

def add(a, b):
    res = a + b
    return res >= mod and res - mod or res

def mul(a, b):
    res = a * b % mod
    return res < 0 and res + mod or res

def solve():
    n, k, mod = map(int, sys.stdin.readline().split())
    if k % 2 == 0:
        print mul(solve2(n / 2, k / 2 + 1), solve2((n + 1) / 2, k / 2 + 1))
    else:
        dyn = [[0] * (k + 2) for i in xrange(k + 2)]
        dyn[0][0] = 1
        ndyn = [[0] * (k + 2) for i in xrange(k + 2)]
        for i in xrange((n | 1) / 2 + k / 2 + 2):
            for a in ndyn:
                for j in xrange(k + 2):
                    a[j] = 0
            mask = (i < (n + 1) / 2 and 1 or 0) + (i >= k / 2 + 2 and 2 or 0)
            for m in xrange(mask, -1, -1):
                for j in xrange(k + 2):
                    for jj in xrange(k + 2):
                        nj = (m & 1) and min(j + 1, k + 1) or 0
                        njj = (m & 2) and (j != 0 or jj != 0) and max(j, jj) + 1 or 0
                        if nj < k + 2 and njj < k + 2:
                            ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj])
            dyn, ndyn = ndyn, dyn
        ans = 0
        for i in xrange(k + 2):
            for j in xrange(k + 2):
                ans = add(ans, dyn[i][j])
        print ans

def solve2(n, k):
    dyn = [1] * k
    for i in xrange(n):
        v = dyn[k - 1]
        for j in xrange(k - 2, -1, -1):
            dyn[j + 1] = add(dyn[j], v)
        dyn[0] = v
    return dyn[k - 1]

solve()
```

## 2980 - Truck History

### 题目大意

给出一棵树，树上有一些点有权值，问从根节点到每个点的路径上权值最大的点的权值和。

### 解题思路

树形dp，先dfs一遍求出每个点到根节点的路径上权值最大的点的权值，然后再dfs一遍求出答案。

### 代码

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p2980 {

    static int solve(int u, int p) {
        int res = 0;
        for (int v: adj[u]) {
            if (v != p) {
                res = Math.max(res, solve(v, u));
            }
        }
        res = Math.max(res, val[u]);
        ans[u] = ans[p] + res;
        return res;
    }

    static void solve() throws Exception {
        int n = scanInt();
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i < n; i++) {
            int u =
