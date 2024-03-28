<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
198 1.10

Expected output:
217


```
import sys
import math
from collections import deque
from decimal import Decimal

sys.setrecursionlimit(1000000)
MOD = 10 ** 9 + 7
input = lambda: sys.stdin.readline().strip()
NI = lambda: int(input())
NMI = lambda: map(float, input().split())
NLI = lambda: list(NMI())
SI = lambda: input()


def make_grid(h, w, num): return [[int(num)] * w for _ in range(h)]


#é£æ¥ãªã¹ã 1-order
def make_adjlist_d(n, edges):
    res = [[] for _ in range(n + 1)]
    for edge in edges:
        res[edge[0]].append(edge[1])
        res[edge[1]].append(edge[0])
    return res


def make_adjlist_nond(n, edges):
    res = [[] for _ in range(n + 1)]
    for edge in edges:
        res[edge[0]].append(edge[1])
    return res


#nCr
def cmb(n, r):
    return math.factorial(n) // math.factorial(r) // math.factorial(n - r)


def main():
    A, B = input().split()
    print(int(Decimal(A) * Decimal(B)))


if __name__ == "__main__":
    main()
```
[/INST]
```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = (int) 1e9 + 7;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adj = new int[n + 1][mod];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u][v] = 1;
            adj[v][u] = 1;
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += cmb(n, i) * dfs(i, adj, ans);
        }
        System.out.println(ans);
    }

    static int dfs(int u, int[][] adj, int ans) {
        if (adj[u][mod] == 0) return 0;
        ans += dfs(adj[u][mod], adj, ans);
        for (int v : adj[u]) {
            if (v != adj[u][mod]) {
                ans += dfs(v, adj, ans);
            }
        }
        return ans;
    }

    static int cmb(int n, int r) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        long num = fact / (fact / r);
        long den = fact / (fact / (n - r));
        return (int) (num / den);
    }
}
```</s>
